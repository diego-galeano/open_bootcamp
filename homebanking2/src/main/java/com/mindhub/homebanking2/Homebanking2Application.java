package com.mindhub.homebanking2;

import com.mindhub.homebanking2.models.Account;
import com.mindhub.homebanking2.models.Client;
import com.mindhub.homebanking2.repository.AccountRepository;
import com.mindhub.homebanking2.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class Homebanking2Application {

	public static void main(String[] args) {
		SpringApplication.run(Homebanking2Application.class, args);
		System.out.println("======finish========");
	}
	@Bean
	public CommandLineRunner initData(ClientRepository clientRepository, AccountRepository accountRepository){
		return args -> {
			Client melbaMorel = clientRepository.save(new Client("Melba", "Morel", "melba@mindhub.com"));
			Client vilatikButerin =	clientRepository.save(new Client("Vitalik","Buterin","vitalik@ethereum.com"));
			Client timCook = clientRepository.save(new Client("Tim","Cook", "tim@appel.com"));
			clientRepository.save(new Client("Elon","Musk", "elon@tesla.com"));
			clientRepository.save(new Client("Carlos", "Garcia", "charly@saynomore.com"));


			LocalDateTime today = LocalDateTime.now();
			LocalDateTime tomorrow = today.plusDays(1);

			accountRepository.save(new Account("VIN001",today, 5000D, melbaMorel));
			accountRepository.save(new Account("VI002", tomorrow, 7500D, melbaMorel));

			accountRepository.save(new Account("VIN003", today.minusDays(1), 1_000_000.05, vilatikButerin));

			accountRepository.save(new Account("VIN004", LocalDateTime.now().plusDays(2), 2000D, timCook));
		};
	}

}

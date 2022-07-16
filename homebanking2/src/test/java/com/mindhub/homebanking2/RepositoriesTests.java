package com.mindhub.homebanking2;

import com.mindhub.homebanking2.models.Account;
import com.mindhub.homebanking2.models.Card;
import com.mindhub.homebanking2.models.Client;
import com.mindhub.homebanking2.models.Loan;
import com.mindhub.homebanking2.repository.AccountRepository;
import com.mindhub.homebanking2.repository.CardRepository;
import com.mindhub.homebanking2.repository.ClientRepository;
import com.mindhub.homebanking2.repository.LoanRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.mindhub.homebanking2.models.CardColor.GOLD;
import static com.mindhub.homebanking2.models.CardType.CREDIT;
import static com.mindhub.homebanking2.models.CardType.DEBIT;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;


//    @DataJpaTest
    @SpringBootTest
    @AutoConfigureTestDatabase(replace = NONE)
    public class RepositoriesTest {



        @Autowired
        LoanRepository loanRepository;

        @Autowired
        AccountRepository accountRepository;

        @Autowired
        CardRepository cardRepository;

        @Autowired
        ClientRepository clientRepository;


        @Test

        public void existLoans(){

            List<Loan> loans = loanRepository.findAll();

            assertThat(loans,is(not(empty())));

        }



        @Test

        public void existPersonalLoan(){

            List<Loan> loans = loanRepository.findAll();

            assertThat(loans, hasItem(hasProperty("name", is("Personal"))));

        }

        @Test
        public void existHipotecarioLoan(){
            List<Loan> loans = loanRepository.findAll();

            assertThat(loans, hasItem(hasProperty("name", is("Hipotecario"))));
        }

    @Test
    public void existAutomotrizLoan(){
        List<Loan> loans = loanRepository.findAll();

        assertThat(loans, hasItem(hasProperty("name", is("Automotriz"))));
    }


    @Test
    public void existAccounts(){
        List<Account> accounts = accountRepository.findAll() ;
        assertThat(accounts,is(not(empty())));
    }

    @Test
    public  void existClients(){
            List<Client> clients = clientRepository.findAll();
            assertThat(clients, is(not(empty())));
    }

    @Test
    public void existClient(){
        List<Client> clients = clientRepository.findAll();
        assertThat(clients,hasItem(hasProperty("firstName",is("Melba"))));
    }
    @Test
    public void existAccount(){
        List<Account> account = accountRepository.findAll();
        assertThat(account,hasItem(hasProperty("number", is("VIN001"))));
        assertThat(account,hasItem(hasProperty("number", is("VIN002"))));
    }

    @Test
    public void existCards(){
        List<Card> cardList = cardRepository.findAll();
        assertThat(cardList, is(not(empty())));
    }
    @Test
    public void existCreditCards(){
            List<Card> creditCards = cardRepository.findAll();
            assertThat(creditCards,hasItem((hasProperty("cardType", is(CREDIT)))));
            assertThat(creditCards, hasItem(hasProperty("cardColor", is(GOLD))));
    }

    @Test
    public void existDebitCards(){
        List<Card> creditCards = cardRepository.findAll();
        assertThat(creditCards, hasItem(hasProperty("cardType", is(DEBIT))));
        assertThat(creditCards, hasItem(hasProperty("cardColor", is(GOLD))));
    }


}

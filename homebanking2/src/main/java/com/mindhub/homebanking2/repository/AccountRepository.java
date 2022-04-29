package com.mindhub.homebanking2.repository;

import com.mindhub.homebanking2.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
package com.mindhub.homebancking2.repository;

import com.mindhub.homebancking2.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    
}
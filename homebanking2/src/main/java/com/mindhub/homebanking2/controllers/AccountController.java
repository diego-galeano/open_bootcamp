package com.mindhub.homebanking2.controllers;

import com.mindhub.homebanking2.models.Account;
import com.mindhub.homebanking2.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;

    @RequestMapping("/accounts")
    private List<Account>getAccount(){
        return accountRepository.findAll();
    }
}

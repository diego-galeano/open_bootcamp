package com.mindhub.homebanking2.dtos;

import com.mindhub.homebanking2.models.Account;

import java.time.LocalDateTime;

public class AccountDTO {
    private Long id;
    private String number;
    private LocalDateTime creationData;
    private double balance;

    protected AccountDTO(){}

    public AccountDTO(Account account) {
        this.id = account.getId();
        this.number = account.getNumber();
        this.creationData = account.getCreationData();
        this.balance = account.getBalance();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDateTime getCreationData() {
        return creationData;
    }

    public void setCreationData(LocalDateTime creationData) {
        this.creationData = creationData;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

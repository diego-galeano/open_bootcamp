package com.mindhub.homebanking2.dtos;


import com.mindhub.homebanking2.models.Client;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


public class ClientDTO {

    private Long id;
    private String firstname;
    private String lastName;
    private String email;
    private Set<AccountDTO> accounts = new HashSet<>();



    protected ClientDTO(){}

    public ClientDTO(Client client){
        this.id = client.getId();
        this.firstname = client.getFirstName();
        this.lastName = client.getLastName();
        this.email = client.getEmail();
//        repasar!!!
        this.accounts = client.getAccounts().stream().map(AccountDTO::new).collect(Collectors.toSet());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Set<AccountDTO> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<AccountDTO> accounts) {
        this.accounts = accounts;
    }
}

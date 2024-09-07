package com.sabya.javapoc.modelling.atm.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    private String name;
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    private Card card;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Account> accounts = new ArrayList<>();

    public Customer(String name, String email, Card card) {
        this.name = name;
        this.email = email;
        this.card = card;
    }

    public boolean authenticate(String enteredPin) {
        return card.validatePin(enteredPin);
    }

    public Account getAccountByType(AccountType type) {
        return accounts.stream().filter(account -> account.getAccountType() == type).findFirst().orElseThrow();
    }
}

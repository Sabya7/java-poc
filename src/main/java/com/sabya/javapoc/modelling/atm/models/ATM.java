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
public class ATM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long atmId;

    private String location;
    private boolean status;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Transaction> transactionLog = new ArrayList<>();

    public ATM(String location) {
        this.location = location;
        this.status = true;
    }

    public void addTransaction(Transaction transaction) {
        transactionLog.add(transaction);
    }

    public void shutDown() {
        this.status = false;
    }

    public void start() {
        this.status = true;
    }
}

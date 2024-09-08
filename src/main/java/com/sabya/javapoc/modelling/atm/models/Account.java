package com.sabya.javapoc.modelling.atm.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;

    private BigDecimal balance;

    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    public Account(AccountType accountType) {
        this.accountType = accountType;
        this.balance = BigDecimal.ZERO;
    }

    public void deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }

    public void withdraw(BigDecimal amount) throws InsufficientFundsException {
        if (this.balance.compareTo(amount) < 0) {
            throw new InsufficientFundsException("Insufficient balance.");
        }
        this.balance = this.balance.subtract(amount);
    }

    public void transfer(Account targetAccount, BigDecimal amount) throws InsufficientFundsException {
        this.withdraw(amount);
        targetAccount.deposit(amount);
    }
}

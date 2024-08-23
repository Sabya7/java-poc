package com.sabya.javapoc.modelling.splitwise;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ExpenseOwingUser extends BaseModel {
    @ManyToOne
    private Expense expense;
    @ManyToOne // 1 user will have many entries
    private User user;
    private double amount;
}

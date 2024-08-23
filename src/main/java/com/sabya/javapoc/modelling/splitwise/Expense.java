package com.sabya.javapoc.modelling.splitwise;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Expense extends BaseModel {
    private double amount;
    @ManyToOne
    private Currency currency;
    @ManyToMany
    private List<User> participants;
    @ManyToOne
    private User createdBy;
    private String name;
    private String description;
}

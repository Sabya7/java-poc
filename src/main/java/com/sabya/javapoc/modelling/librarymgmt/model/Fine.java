package com.sabya.javapoc.modelling.librarymgmt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Fine extends BaseModel {
    private double amount;
    @OneToOne
    private BooKLending booKLending;
    @OneToOne
    private Account account;
}

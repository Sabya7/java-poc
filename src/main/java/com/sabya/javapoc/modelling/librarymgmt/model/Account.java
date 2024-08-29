package com.sabya.javapoc.modelling.librarymgmt.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Account extends BaseModel {
    private String id;
    @OneToOne
    private Person person;
    @Enumerated(EnumType.STRING)
    private AccountStatus status;
    @OneToMany
    private List<BookReservation> bookReservations;
    @OneToMany
    private List<BooKLending> booKLendings;
}

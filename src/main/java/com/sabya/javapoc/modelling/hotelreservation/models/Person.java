package com.sabya.javapoc.modelling.hotelreservation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Person extends BaseModel {
    private String name;
    private String email;
    private String phoneNumber;
    @OneToOne
    private Account account;
}

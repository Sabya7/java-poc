package com.sabya.javapoc.modelling.airline.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Passenger {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private String email;
    private String phoneNumber;

}
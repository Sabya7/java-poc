package com.sabya.javapoc.modelling.airline.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Aircraft {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private String model;
    private int manufactureYear;

    @ManyToOne
    private Airline airline;
}
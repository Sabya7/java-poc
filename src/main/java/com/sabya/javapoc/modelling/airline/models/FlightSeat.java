package com.sabya.javapoc.modelling.airline.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.UUID;

@Entity
public class FlightSeat {
    @Id
    @GeneratedValue
    private UUID id;

    private String seatNumber;
    private boolean isAvailable;
    @ManyToOne
    private FlightReservation reservation;

    @ManyToOne
    private FlightInstance flightInstance;

}
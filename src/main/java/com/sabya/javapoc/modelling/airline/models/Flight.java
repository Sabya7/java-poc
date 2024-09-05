package com.sabya.javapoc.modelling.airline.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight {
    @Id
    @GeneratedValue
    private UUID id;

    private String flightNumber;

    @ManyToOne
    private Airport departureAirport;

    @ManyToOne
    private Airport arrivalAirport;

    @ManyToOne
    private Aircraft assignedAircraft;

    @OneToMany(mappedBy = "flight", cascade = CascadeType.ALL)
    private List<FlightInstance> flightInstances;

}
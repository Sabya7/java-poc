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
public class FlightReservation {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    private FlightInstance flightInstance;

    @ManyToMany
    private List<Passenger> passengers;

    private ReservationStatus status;

    @OneToMany(mappedBy = "reservation", cascade = CascadeType.ALL)
    private List<FlightSeat> seatAssignments;

    private double totalCost;

}
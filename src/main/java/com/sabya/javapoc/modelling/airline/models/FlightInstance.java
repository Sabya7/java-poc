package com.sabya.javapoc.modelling.airline.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Data
public class FlightInstance {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    private Flight flight;

    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;

    private FlightStatus status;

    @OneToMany(mappedBy = "flightInstance", cascade = CascadeType.ALL)
    private List<FlightSeat> seats;

}
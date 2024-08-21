package com.sabya.javapoc.modelling.parkinglot.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel {
    @OneToOne
    private Vehicle vehicle;
    private LocalDateTime entryTime;
    @ManyToOne
    private User operator;
    @OneToOne
    private Gate entryGate;
    @OneToOne
    private Slot slot;
}

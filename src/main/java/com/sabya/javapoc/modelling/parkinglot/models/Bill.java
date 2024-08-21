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
public class Bill extends BaseModel {
    @OneToOne
    private Ticket ticket;
    @ManyToOne
    private Gate exitGate;
    private int amount;
    private LocalDateTime exitTime;
    @OneToOne // improvement - pay a single bill in multiple payments
    private Payment payment;

}

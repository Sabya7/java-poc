package com.sabya.javapoc.modelling.booking.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Payment extends BaseModel {
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;
    private LocalDateTime timeOfPayment;
    private double amount;
    private String refId;
    @ManyToOne
    private Ticket ticket;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

}

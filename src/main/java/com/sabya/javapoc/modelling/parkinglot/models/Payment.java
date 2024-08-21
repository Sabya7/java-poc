package com.sabya.javapoc.modelling.parkinglot.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    private int amount;
    private String refId;
    private PaymentStatus paymentStatus;
}

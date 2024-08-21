package com.sabya.javapoc.modelling.parkinglot.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Gate extends BaseModel {
    private GateType type;
    @OneToOne
    private User operator;
    private int gateNumber;
    @ManyToOne
    private ParkingLot parkingLot;
}

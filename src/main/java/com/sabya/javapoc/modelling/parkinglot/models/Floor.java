package com.sabya.javapoc.modelling.parkinglot.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Floor extends BaseModel {
    private int number;
    @OneToMany
    private List<Slot> slots;
    @ManyToOne
    private ParkingLot parkingLot;

}
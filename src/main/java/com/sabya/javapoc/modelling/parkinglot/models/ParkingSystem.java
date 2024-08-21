package com.sabya.javapoc.modelling.parkinglot.models;

import jakarta.persistence.OneToMany;

import java.util.List;


public class ParkingSystem extends BaseModel {
    @OneToMany
    List<ParkingLot> parkingLots;
}

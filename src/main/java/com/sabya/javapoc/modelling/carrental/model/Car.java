package com.sabya.javapoc.modelling.carrental.model;

import jakarta.persistence.Entity;

@Entity
public class Car extends Vehicle {
    public Car() {
        this.setVehicleType(VehicleType.CAR);
    }
}

package com.sabya.javapoc.modelling.carrental.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Car extends Vehicle {
    public Car() {
//        this.setVehicleType(VehicleType.CAR);
    }
}

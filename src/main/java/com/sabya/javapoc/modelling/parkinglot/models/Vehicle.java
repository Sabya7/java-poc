package com.sabya.javapoc.modelling.parkinglot.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Vehicle extends BaseModel {
    private String registrationNumber;
    @OneToOne
    private VehicleType vehicleType;
}

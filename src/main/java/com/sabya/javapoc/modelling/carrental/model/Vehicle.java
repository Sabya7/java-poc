package com.sabya.javapoc.modelling.carrental.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public abstract class Vehicle extends BaseModel {
    private VehicleType vehicleType;
    @OneToOne
    private ParkingStall parkingStall;
    private String barcode;
}

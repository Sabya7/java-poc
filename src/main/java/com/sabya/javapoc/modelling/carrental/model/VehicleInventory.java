package com.sabya.javapoc.modelling.carrental.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Entity
@Getter
@Setter
public class VehicleInventory extends  BaseModel {
    private HashMap<VehicleType, Integer> vehicleTypeIndex;
    private HashMap<Vehicle, Integer> vehicleIndex;
}

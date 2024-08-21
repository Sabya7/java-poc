package com.sabya.javapoc.modelling.parkinglot.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class VehicleType extends BaseModel {
    private String name;
}

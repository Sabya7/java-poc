package com.sabya.javapoc.modelling.carrental.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ParkingStall extends BaseModel {
    private int stallNumber;

    private String locationIdentifies;
}

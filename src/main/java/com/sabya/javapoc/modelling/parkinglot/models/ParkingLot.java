package com.sabya.javapoc.modelling.parkinglot.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class ParkingLot extends BaseModel {

    private String name;
    private String address;
    @OneToMany
    private List<Floor> floors;
    @OneToMany
    private List<Gate> gates;
    private ParkingLotStatus parkingLotStatus;


}

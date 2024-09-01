package com.sabya.javapoc.modelling.carrental.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class VehicleItem extends BaseModel {
    @ManyToOne
    private Vehicle vehicle;
    private VehicleStatus status;
    @OneToMany
    private List<VehicleLog> logs;
    @OneToMany
    private List<VehicleRegistration> vehicleRegistrations;
}

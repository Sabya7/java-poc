package com.sabya.javapoc.modelling.carrental.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class CarRentalSystem extends BaseModel {
    private String name;

    @OneToMany
    private List<CarRentalLocation> locations;
}

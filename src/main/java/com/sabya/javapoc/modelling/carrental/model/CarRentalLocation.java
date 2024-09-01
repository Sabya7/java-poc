package com.sabya.javapoc.modelling.carrental.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CarRentalLocation extends BaseModel {
    private long number;

    private String address;

}

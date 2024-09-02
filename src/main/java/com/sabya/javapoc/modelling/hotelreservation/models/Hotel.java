package com.sabya.javapoc.modelling.hotelreservation.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Hotel extends BaseModel {
    private String name;
    private String address;
}

package com.sabya.javapoc.modelling.parkinglot.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "users")
public class User extends BaseModel {
    private String firstName;
    private String lastName;
    private UserType type;
}

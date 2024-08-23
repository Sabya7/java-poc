package com.sabya.javapoc.modelling.booking.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "users")
public class User extends BaseModel {
    @Enumerated(EnumType.STRING)
    private UserType userType;
    private String name;
    private String email;
}

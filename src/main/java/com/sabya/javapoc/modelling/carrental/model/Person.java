package com.sabya.javapoc.modelling.carrental.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Person extends BaseModel {
    private String Name;
    private String userName;
    private String email;
}

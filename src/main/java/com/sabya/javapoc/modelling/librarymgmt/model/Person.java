package com.sabya.javapoc.modelling.librarymgmt.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Person extends BaseModel{
    private String type;
    private String name;
    private String email;
    private String phone;
}

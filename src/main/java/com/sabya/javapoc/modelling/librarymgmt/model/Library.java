package com.sabya.javapoc.modelling.librarymgmt.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Library extends BaseModel {
    private String Name;
    private String address;
}

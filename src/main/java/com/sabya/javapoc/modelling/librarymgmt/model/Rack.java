package com.sabya.javapoc.modelling.librarymgmt.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Rack extends BaseModel {
    private int rackNumber;
    private String locationIdentifier;

}

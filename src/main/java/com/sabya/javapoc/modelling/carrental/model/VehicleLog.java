package com.sabya.javapoc.modelling.carrental.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class VehicleLog extends BaseModel {

    private String createdBy;
    private String log;

}

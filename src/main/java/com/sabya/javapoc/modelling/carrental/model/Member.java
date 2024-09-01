package com.sabya.javapoc.modelling.carrental.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Member extends BaseModel {
    private String licenseNumber;
    private LocalDateTime licenseExpiryDate;
}

package com.sabya.javapoc.modelling.booking.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class City extends BaseModel {
    private String name;
    @OneToMany
    @JoinColumn(name = "city")
    private List<Theatre> theatres;
}
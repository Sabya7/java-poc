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
public class Theatre extends BaseModel {
    private String name;
    private String address;
    @OneToMany
    @JoinColumn(name = "audi_id")
    private List<Audi> audi;
    @OneToMany
    @JoinColumn(name = "show_id")
    private List<Show> upcomingShows;
}

package com.sabya.javapoc.modelling.cricinfo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int age;

    private String country;

    private String role;

    @OneToMany
    private List<Stat> stats;
}

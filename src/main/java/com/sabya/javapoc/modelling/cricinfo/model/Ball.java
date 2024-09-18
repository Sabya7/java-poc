package com.sabya.javapoc.modelling.cricinfo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Ball {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Over over;

    private int ballNumber;

    private int runsScored;

    private boolean isWicket;
}

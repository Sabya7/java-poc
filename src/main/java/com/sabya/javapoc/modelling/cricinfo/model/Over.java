package com.sabya.javapoc.modelling.cricinfo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Over {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Innings innings;

    private int overNumber;
}
package com.sabya.javapoc.modelling.chess.modelling;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;

    @Enumerated(EnumType.STRING)
    private Color color;
}

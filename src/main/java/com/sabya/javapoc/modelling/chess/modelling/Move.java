package com.sabya.javapoc.modelling.chess.modelling;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Move {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Game game;

    @ManyToOne(fetch = FetchType.LAZY)
    private Player player;

    private String fromPosition;

    private String toPosition;

    @ManyToOne(fetch = FetchType.LAZY)
    private Piece movedPiece;

    @ManyToOne(fetch = FetchType.LAZY)
    private Piece capturedPiece;
}

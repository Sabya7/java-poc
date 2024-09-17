package com.sabya.javapoc.modelling.chess.modelling;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Piece {
    private Color color;
    private String type;
}

package com.sabya.javapoc.modelling.chess.modelling;

import com.sabya.javapoc.snakesandladders.models.Board;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "game")
    private List<Move> moves = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    private Player playerWhite;

    @ManyToOne(fetch = FetchType.LAZY)
    private Player playerBlack;

    private GameState state;

    @Transient
    private Board board;

    public Game(Board board) {
        this.state = GameState.ONGOING;
        this.board = board;
    }

}

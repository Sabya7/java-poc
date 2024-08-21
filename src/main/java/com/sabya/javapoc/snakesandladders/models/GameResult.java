package com.sabya.javapoc.snakesandladders.models;

import lombok.Getter;

@Getter
public class GameResult {
    private Player winner;
    private final GameStatus gameStatus;

    public GameResult(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public GameResult(Player player, GameStatus gameStatus) {
        this(gameStatus);
        this.winner = player;
    }

    public boolean isGameOver() {
        return gameStatus != GameStatus.IN_PROGRESS;
    }
}

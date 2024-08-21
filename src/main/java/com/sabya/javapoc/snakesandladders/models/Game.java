package com.sabya.javapoc.snakesandladders.models;

import lombok.Data;

import java.util.List;

@Data
public class Game {
    // Each game object represents instance of a snake and ladder game.

    //attributes
    private Board board;
    private Dice dice;

    private Player winner;
    private List<Player> players;
    private int currentTurnIndex;
    private int maxPlayers;
    private GameResult gameResult;

    public Game() {
       board = new Board();
       dice = new Dice();
       gameResult = new GameResult(GameStatus.IN_PROGRESS);
       maxPlayers = 2;
       currentTurnIndex = 0;
    }


    public boolean addPlayer(Player player) {
        board.stagePlayer(player);
        return players.add(player);
    }

    public void addSnake(int start, int end) {
        board.addSnake(start, end);
    }

    public void addLadder(int start, int end) {
        board.addLadder(start, end);
    }

    public boolean isPlayersLimitReached() {
        return players.size() == maxPlayers;
    }

    public GameResult rollDice() {
        int rolledValue = dice.roll();
        currentTurnIndex = (currentTurnIndex + 1 ) % maxPlayers;
        Player player = players.get(currentTurnIndex);
        if(board.move(player, rolledValue) == GameStatus.COMPLETED) {
            gameResult = new GameResult(player, GameStatus.COMPLETED);
        }

        return gameResult;

    }
}

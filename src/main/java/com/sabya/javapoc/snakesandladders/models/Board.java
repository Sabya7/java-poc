package com.sabya.javapoc.snakesandladders.models;

import lombok.Getter;

import java.util.HashMap;

@Getter
public class Board {
    HashMap<Player, Integer> currentPositions;
    HashMap<Integer, Integer> snakes;
    HashMap<Integer, Integer> ladders;

    public Board() {
        this.currentPositions = new HashMap<Player, Integer>();
        snakes = new HashMap<>();
        ladders = new HashMap<>();
    }

    public void addSnake(int start, int end) {
        snakes.put(start, end);
    }

    public void addLadder(int start, int end) {
        ladders.put(start, end);
    }

    public void stagePlayer(Player player) {
        currentPositions.put(player, 1);
    }


    public GameStatus move(Player player, int diceRollValue) {
        int curPosition = currentPositions.get(player);
        int next = curPosition + diceRollValue;
        if(next == 100)
            return GameStatus.COMPLETED;
        if(next > 100)
            next = curPosition;
        else if (snakes.containsKey(next)) {
            next = snakes.get(next);
        } else if (ladders.containsKey(next)) {
            next = ladders.get(next);
        }

        return GameStatus.IN_PROGRESS;
    }
}

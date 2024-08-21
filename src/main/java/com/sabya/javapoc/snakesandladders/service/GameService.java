package com.sabya.javapoc.snakesandladders.service;

import com.sabya.javapoc.snakesandladders.exceptions.MaxPlayersReachedException;
import com.sabya.javapoc.snakesandladders.models.Game;
import com.sabya.javapoc.snakesandladders.models.GameResult;
import com.sabya.javapoc.snakesandladders.models.Player;

import java.util.HashMap;
import java.util.UUID;

public class GameService {
    private final HashMap<UUID, Game> games;
    private final HashMap<UUID, GameResult> completedGames;

    public GameService() {
        games = HashMap.newHashMap(16);
        completedGames = HashMap.newHashMap(16);
    }

    public UUID createGame() {
        Game game = new Game();
        UUID uuid = UUID.randomUUID();
        games.put(uuid, game);
        stageCharacters(uuid);
        return uuid;
    }

    boolean addPlayers(UUID uuid, Player player) {
        if(!isGameInProgress(uuid))
            throw new IllegalStateException("Game is either completed or not started");
         if(games.get(uuid).isPlayersLimitReached())
             throw new MaxPlayersReachedException();

         return games.get(uuid).addPlayer(player);
    }

    private void stageCharacters(UUID uuid) {
        games.get(uuid).addSnake(97, 3);
        games.get(uuid).addSnake(37, 11);
        games.get(uuid).addLadder(5, 28);
        games.get(uuid).addLadder(17, 67);
    }

    public GameResult rollDIce(UUID uuid) {
        if(!isGameInProgress(uuid))
            throw new IllegalStateException("Game is either completed or not started");
        GameResult gameResult = games.get(uuid).rollDice();
        if(gameResult.isGameOver()) {
            games.remove(uuid);
            completedGames.put(uuid, gameResult);
        }
        return gameResult;
    }

    private boolean isGameInProgress(UUID uuid) {
        return games.containsKey(uuid);
    }
}

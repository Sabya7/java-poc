package com.sabya.javapoc.modelling.blackjack.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "game_id")
    private List<Player> players;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dealer_id")
    private Dealer dealer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "deck_id")
    private Deck deck;

    public Game(List<Player> players) {
        this.players = players;
        this.dealer = new Dealer();
        this.deck = new Deck();
        startGame();
    }

    private void startGame() {
        for (Player player : players) {
            player.getHand().addCard(deck.dealCard());
            player.getHand().addCard(deck.dealCard());
        }
        dealer.dealCard(deck);
        dealer.dealCard(deck);
    }

}
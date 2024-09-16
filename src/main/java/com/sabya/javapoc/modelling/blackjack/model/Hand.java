package com.sabya.javapoc.modelling.blackjack.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Hand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "hand_id")
    private List<BlackJackCard> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void addCard(BlackJackCard card) {
        cards.add(card);
    }

    public int getHardTotal() {
        int total = 0;
        for (BlackJackCard card : cards) {
            total += card.getPointValue();
        }
        return total;
    }

    public int getSoftTotal() {
        int total = getHardTotal();
        if (containsAce() && total + 10 <= 21) {
            total += 10;
        }
        return total;
    }

    private boolean containsAce() {
        return cards.stream().anyMatch(card -> card.getRank().equals("A"));
    }

}
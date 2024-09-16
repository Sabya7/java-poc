package com.sabya.javapoc.modelling.blackjack.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Dealer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hand_id")
    private Hand hand;

    public Dealer() {
        this.hand = new Hand();
    }

    public void dealCard(Deck deck) {
        hand.addCard(deck.dealCard());
    }

    public boolean shouldHit() {
        return hand.getHardTotal() < 17;
    }

}
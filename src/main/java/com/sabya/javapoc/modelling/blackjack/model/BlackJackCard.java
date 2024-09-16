package com.sabya.javapoc.modelling.blackjack.model;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue("BLACKJACK")
@Data
public class BlackJackCard extends Card {

    public BlackJackCard() {}

    public BlackJackCard(String suit, String rank) {
        super(suit, rank);
    }

    @Override
    public int getPointValue() {
        return switch (getRank()) {
            case "J", "Q", "K" -> 10;
            case "A" -> 11;
            default -> Integer.parseInt(getRank());
        };
    }
}
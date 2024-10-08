package com.sabya.javapoc.modelling.blackjack.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "card_type")
@Data
public abstract class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String suit;
    private String rank;

    public Card() {}

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public abstract int getPointValue();

}
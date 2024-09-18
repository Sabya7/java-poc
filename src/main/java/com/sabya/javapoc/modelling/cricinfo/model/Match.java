package com.sabya.javapoc.modelling.cricinfo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Team team1;

    @ManyToOne
    private Team team2;

    private LocalDate matchDate;

    @Enumerated(EnumType.STRING)
    private MatchType matchType;

    @OneToMany(mappedBy = "match")
    private List<Innings> inningsList;
}

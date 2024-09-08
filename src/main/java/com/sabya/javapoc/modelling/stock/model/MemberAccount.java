package com.sabya.javapoc.modelling.stock.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@DiscriminatorValue("MEMBER")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberAccount extends Account {
    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Watchlist> watchlists;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<StockPosition> stockPositions;

}

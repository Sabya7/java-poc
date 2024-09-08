package com.sabya.javapoc.modelling.stock.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private MemberAccount member;

    @ManyToOne
    private Stock stock;

    private Integer quantity;

    @OneToMany(mappedBy = "stockPosition", cascade = CascadeType.ALL)
    private List<StockLot> stockLots;

}

package com.sabya.javapoc.modelling.stock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Stock {
    @Id
    private String symbol;

    private String name;
    private BigDecimal currentPrice;

}

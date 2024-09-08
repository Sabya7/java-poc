package com.sabya.javapoc.modelling.stock.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@DiscriminatorValue("LIMIT")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LimitOrder extends Order {
    private BigDecimal limitPrice;

}

package com.sabya.javapoc.modelling.stock.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("MARKET")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MarketOrder extends Order {
}


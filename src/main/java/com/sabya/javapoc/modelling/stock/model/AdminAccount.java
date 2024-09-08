package com.sabya.javapoc.modelling.stock.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("ADMIN")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminAccount extends Account {
}

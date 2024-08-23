package com.sabya.javapoc.modelling.splitwise;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Currency extends BaseModel {
    private String symbol;
}

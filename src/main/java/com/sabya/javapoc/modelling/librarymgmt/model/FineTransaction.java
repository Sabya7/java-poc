package com.sabya.javapoc.modelling.librarymgmt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class FineTransaction extends BaseModel {
    @ManyToOne
    private Fine fine;
    private String paymentRefId;
}

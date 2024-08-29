package com.sabya.javapoc.modelling.librarymgmt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class BooKLending extends BaseModel {
    @ManyToOne
    private Account borrowedBy;
    private LocalDateTime dueDate;
    private LocalDateTime returnDate;
}

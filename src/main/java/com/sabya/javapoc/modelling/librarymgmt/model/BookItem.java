package com.sabya.javapoc.modelling.librarymgmt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class BookItem extends BaseModel {
    @ManyToOne
    private Book book;
    private String barcode;
    private String isReferenceOnly;
    private LocalDateTime borrowedDate;
    private LocalDateTime dueDate;
    @ManyToOne
    private Account reservedBy;
    @ManyToOne
    private Account borrowedBy;
    @Enumerated(EnumType.STRING)
    private BookFormat format;
    @Enumerated(EnumType.STRING)
    private BookStatus status;
    private LocalDateTime purchaseDate;
    private LocalDateTime publishedDate;
    @ManyToOne
    private Rack placedAt;
}

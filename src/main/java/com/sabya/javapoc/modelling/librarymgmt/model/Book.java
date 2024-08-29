package com.sabya.javapoc.modelling.librarymgmt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Book extends BaseModel {
    private long ISBN;
    private String title;
    private String subject;
    private String Language; //can be there in bookItems
    @ManyToMany
    private List<Person> authors;
    private int pages;

}

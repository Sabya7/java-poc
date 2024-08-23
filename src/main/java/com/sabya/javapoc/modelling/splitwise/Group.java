package com.sabya.javapoc.modelling.splitwise;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "groups")
public class Group extends BaseModel {
    @OneToMany
    private List<Expense> expenses;
    @ManyToMany
    private List<User> members;
    private String name;
    private String description;
    @ManyToOne
    private User createdBy;
}

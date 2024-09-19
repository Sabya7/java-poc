package com.sabya.javapoc.modelling.fb.contexts.group;

import com.sabya.javapoc.modelling.fb.contexts.user.Member;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    @ManyToOne
    private Member creator;

    @OneToMany(mappedBy = "group")
    private List<Membership> members;
}

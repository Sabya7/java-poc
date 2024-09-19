package com.sabya.javapoc.modelling.fb.contexts.user;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String profilePic;
    private String bio;

    @OneToMany(mappedBy = 'member', cascade = CascadeType.ALL)
    private List<Profile> profiles;

    @OneToMany(mappedBy = "requester")
    private List<Friendship> sentFriendRequests;

    @OneToMany(mappedBy = "receiver")
    private List<Friendship> receivedFriendRequests;

    @OneToMany(mappedBy = "follower")
    private List<Follow> followers;

    @OneToMany(mappedBy = "followed")
    private List<Follow> followings;

}
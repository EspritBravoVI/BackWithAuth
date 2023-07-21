package com.esprit.devpi.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private Instant dateNaissance;
    private String email;

    @OneToMany(mappedBy = "customUser", cascade = CascadeType.ALL)
    private List<Feedback> feedbacks;

    @OneToMany(mappedBy = "customUser", cascade = CascadeType.ALL)
    private List<Comment> comments;

    @OneToMany(mappedBy = "customUser", cascade = CascadeType.ALL)
    private List<Reaction> reactions;

    @OneToMany(mappedBy = "customUser", cascade = CascadeType.ALL)
    private List<Reclamation> reclamations;

    @OneToMany(mappedBy = "customUser", cascade = CascadeType.ALL)
    private List<Event> events;

    @OneToMany(mappedBy = "customUser", cascade = CascadeType.ALL)
    private List<Post> posts;

    @OneToOne
    private Cart cart;

    @OneToMany(mappedBy = "customUser", cascade = CascadeType.ALL)
    private List<Reservation> reservations;

    //@ManyToMany(mappedBy = "customUser")
    //private List<CustomUser> participants;

    // Getters and setters
}


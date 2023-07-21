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
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long hostId;
    private Long supplierId;
    private String location;
    private Instant dateEvent;
    private Integer maxParticipants;
    private String longitude;
    private String latitude;

    @Enumerated(EnumType.STRING)
    private ReqStatus requestStatus;

    private String description;
    private Integer participantsCount;

    @OneToMany(mappedBy = "event")
    private List<Feedback> feedbacks;

    @OneToMany(mappedBy = "event")
    private List<Reservation> reservations;

    @OneToMany(mappedBy = "event")
    private List<Product> products;

    @ManyToOne
    private CustomUser customUser;

    //@ManyToMany
    //private List<CustomUser> participants;

    @OneToOne(mappedBy = "event")
    private Transport transport;

    // Getters and setters
}


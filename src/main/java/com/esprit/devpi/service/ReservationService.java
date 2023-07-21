package com.esprit.devpi.service;

import com.esprit.devpi.entities.Reservation;

import java.util.List;

public interface ReservationService {
    Reservation saveReservation(Reservation reservation);
    Reservation getReservationById(Long id);
    List<Reservation> getAllReservations();
    void deleteReservation(Long id);
}





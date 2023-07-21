package com.esprit.devpi.service;

import com.esprit.devpi.entities.Reclamation;

import java.util.List;

public interface ReclamationService {
    Reclamation saveReclamation(Reclamation reclamation);
    Reclamation getReclamationById(Long id);
    List<Reclamation> getAllReclamations();
    void deleteReclamation(Long id);
}





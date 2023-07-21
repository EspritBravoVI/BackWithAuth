package com.esprit.devpi.service;


import com.esprit.devpi.entities.Quantity;

import java.util.List;

public interface QuantityService {
    Quantity saveQuantity(Quantity quantity);
    Quantity getQuantityById(Long id);
    List<Quantity> getAllQuantities();
    void deleteQuantity(Long id);
}





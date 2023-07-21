package com.esprit.devpi.service;

import com.esprit.devpi.DAO.QuantityRepository;
import com.esprit.devpi.entities.Quantity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuantityServiceImpl implements QuantityService {

    private final QuantityRepository quantityRepository;

    @Autowired
    public QuantityServiceImpl(QuantityRepository quantityRepository) {
        this.quantityRepository = quantityRepository;
    }

    @Override
    public Quantity saveQuantity(Quantity quantity) {
        return quantityRepository.save(quantity);
    }

    @Override
    public Quantity getQuantityById(Long id) {
        return quantityRepository.findById(id).orElse(null);
    }

    @Override
    public List<Quantity> getAllQuantities() {
        return quantityRepository.findAll();
    }

    @Override
    public void deleteQuantity(Long id) {
        quantityRepository.deleteById(id);
    }
}


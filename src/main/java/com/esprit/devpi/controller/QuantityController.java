package com.esprit.devpi.controller;


import com.esprit.devpi.entities.Quantity;
import com.esprit.devpi.service.QuantityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quantities")
public class QuantityController {

    private final QuantityService quantityService;

    @Autowired
    public QuantityController(QuantityService quantityService) {
        this.quantityService = quantityService;
    }

    @PostMapping
    public ResponseEntity<Quantity> createQuantity(@RequestBody Quantity quantity) {
        Quantity createdQuantity = quantityService.saveQuantity(quantity);
        return new ResponseEntity<>(createdQuantity, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Quantity> getQuantityById(@PathVariable Long id) {
        Quantity quantity = quantityService.getQuantityById(id);
        if (quantity != null) {
            return new ResponseEntity<>(quantity, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<Quantity>> getAllQuantities() {
        List<Quantity> quantities = quantityService.getAllQuantities();
        return new ResponseEntity<>(quantities, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQuantity(@PathVariable Long id) {
        quantityService.deleteQuantity(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

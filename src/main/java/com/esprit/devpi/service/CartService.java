package com.esprit.devpi.service;


import com.esprit.devpi.entities.Cart;

import java.util.List;

public interface CartService {
    Cart saveCart(Cart cart);
    Cart getCartById(Long id);
    List<Cart> getAllCarts();
    void deleteCart(Long id);
}


package com.masprogtech.services.cart;

import com.masprogtech.entities.Cart;

import java.math.BigDecimal;

public interface ICartService {

    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);

    Long initializeNewCart();

}

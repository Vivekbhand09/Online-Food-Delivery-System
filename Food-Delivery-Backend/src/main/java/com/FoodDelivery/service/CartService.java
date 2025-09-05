package com.FoodDelivery.service;


import com.FoodDelivery.io.CartRequest;
import com.FoodDelivery.io.CartResponse;

public interface CartService {

    CartResponse addToCart(CartRequest request);

    CartResponse getCart();

    void clearCart();

    CartResponse removeFromCart(CartRequest cartRequest);
}

package com.FoodDelivery.service;


import com.FoodDelivery.io.UserRequest;
import com.FoodDelivery.io.UserResponse;

public interface UserService {

    UserResponse registerUser(UserRequest request);

    String findByUserId();
}

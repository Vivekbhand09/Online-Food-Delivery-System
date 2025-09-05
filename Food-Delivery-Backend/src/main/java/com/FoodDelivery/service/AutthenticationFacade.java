package com.FoodDelivery.service;

import org.springframework.security.core.Authentication;


public interface AutthenticationFacade {

    Authentication getAuthentication();
}

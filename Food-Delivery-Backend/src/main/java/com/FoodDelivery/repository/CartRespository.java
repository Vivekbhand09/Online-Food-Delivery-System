package com.FoodDelivery.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.FoodDelivery.entity.CartEntity;
import java.util.Optional;

@Repository
public interface CartRespository extends MongoRepository<CartEntity, String> {

    Optional<CartEntity> findByUserId(String userId);

    void deleteByUserId(String userId);
}

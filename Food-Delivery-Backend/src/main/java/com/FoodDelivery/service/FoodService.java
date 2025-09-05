package com.FoodDelivery.service;


import org.springframework.web.multipart.MultipartFile;

import com.FoodDelivery.io.FoodRequest;
import com.FoodDelivery.io.FoodResponse;

import java.util.List;

public interface FoodService {

    String uploadFile(MultipartFile file);

    FoodResponse addFood(FoodRequest request, MultipartFile file);

    List<FoodResponse> readFoods();

    FoodResponse readFood(String id);

    boolean deleteFile(String filename);

    void deleteFood(String id);
}

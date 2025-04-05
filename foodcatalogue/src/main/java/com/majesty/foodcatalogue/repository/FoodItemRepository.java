package com.majesty.foodcatalogue.repository;

import com.majesty.foodcatalogue.entity.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodItemRepository extends JpaRepository<FoodItem, Integer> {

    List<FoodItem> findByRestaurantId(Integer restaurantId);
}

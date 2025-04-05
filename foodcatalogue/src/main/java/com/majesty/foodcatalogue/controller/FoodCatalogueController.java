package com.majesty.foodcatalogue.controller;

import com.majesty.foodcatalogue.dto.FoodCataloguePage;
import com.majesty.foodcatalogue.dto.FoodItemDto;
import com.majesty.foodcatalogue.entity.FoodItem;
import com.majesty.foodcatalogue.service.FoodCatalogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/foodCatalogue")
public class FoodCatalogueController {

    @Autowired
    FoodCatalogueService foodCatalogueService;

    @PostMapping("/addFoodItem")
    public ResponseEntity<FoodItemDto> addFoodItem(@RequestBody FoodItemDto foodItemDto) {
        FoodItemDto foodItemSaved = foodCatalogueService.addFoodItem(foodItemDto);
        return new ResponseEntity<>(foodItemSaved, HttpStatus.CREATED);
    }

    @GetMapping("/fetchRestaurantAndFooditemById/{restaurantId}")
    public ResponseEntity<FoodCataloguePage> fetchRestaurantAndFooditemById(@PathVariable Integer restaurantId) {
        FoodCataloguePage foodCataloguePage = foodCatalogueService.fetchFoodCataloguePageDetails(restaurantId);
        return new ResponseEntity<>(foodCataloguePage, HttpStatus.OK);
    }


}

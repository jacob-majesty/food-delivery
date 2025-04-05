package com.majesty.foodcatalogue.service;

import com.majesty.foodcatalogue.dto.FoodCataloguePage;
import com.majesty.foodcatalogue.dto.FoodItemDto;
import com.majesty.foodcatalogue.entity.FoodItem;
import com.majesty.foodcatalogue.entity.Restaurant;
import com.majesty.foodcatalogue.mapper.FoodItemMapper;
import com.majesty.foodcatalogue.repository.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FoodCatalogueService {

    @Autowired
    FoodItemRepository foodItemRepository;

    @Autowired
    RestTemplate restTemplate;


    public FoodItemDto addFoodItem(FoodItemDto foodItemDto) {
        FoodItem foodItemSavedInDB =  foodItemRepository.save(FoodItemMapper
                .INSTANCE.mapFoodItemDtoToFoodItem(foodItemDto));
        return FoodItemMapper.INSTANCE.mapFoodItemToFoodItemDto(foodItemSavedInDB);
    }

    public FoodCataloguePage fetchFoodCataloguePageDetails(Integer restaurantId) {

        List<FoodItem> foodItemList = fetchFoodItemList(restaurantId);
        Restaurant restaurant = fetchRestaurantDetailsFromRestaurantMS(restaurantId);
        createFoodCatalogue(foodItemList, restaurant);
        return null;
    }

    private FoodCataloguePage createFoodCatalogue(List<FoodItem> foodItemList, Restaurant restaurant) {
        FoodCataloguePage foodCataloguePage = new FoodCataloguePage();
        foodCataloguePage.setFoodItemList(foodItemList);
        foodCataloguePage.setRestaurant(restaurant);
        return foodCataloguePage;
    }

    private Restaurant fetchRestaurantDetailsFromRestaurantMS(Integer restaurantId) {
        return restTemplate.getForObject("http://RESTAURANT-SERVICE/restaurant/fetchById/"+restaurantId, Restaurant.class);
    }

    private List<FoodItem> fetchFoodItemList(Integer restaurantId) {
        return foodItemRepository.findByRestaurantId(restaurantId);
    }
}

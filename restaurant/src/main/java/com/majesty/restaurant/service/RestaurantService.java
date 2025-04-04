package com.majesty.restaurant.service;

import com.majesty.restaurant.dto.RestaurantDto;
import com.majesty.restaurant.entity.Restaurant;
import com.majesty.restaurant.mapper.RestaurantMapper;
import com.majesty.restaurant.repository.RestaurantRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;

    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public List<RestaurantDto> findAllRestaurants() {
        List<Restaurant> restaurants = restaurantRepository.findAll();
        return restaurants.stream()
                .map(RestaurantMapper.INSTANCE::mapRestaurantToRestaurantDto)
                .collect(Collectors.toList());
    }


    public RestaurantDto addRestaurantInDB(RestaurantDto restaurantDto) {
        Restaurant savedRestaurant = restaurantRepository.save(RestaurantMapper
                .INSTANCE.mapRestaurantDtOToRestaurant(restaurantDto));
        return RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDto(savedRestaurant);
    }

    public ResponseEntity<RestaurantDto> fetchRestaurantById(Integer id) {
        Optional<Restaurant> restaurant = restaurantRepository.findById(id);
        return restaurant.map(value -> new ResponseEntity<>(RestaurantMapper.INSTANCE
                .mapRestaurantToRestaurantDto(value), HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
    }
}

package com.majesty.foodcatalogue.dto;

import com.majesty.foodcatalogue.entity.FoodItem;
import com.majesty.foodcatalogue.entity.Restaurant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodCataloguePage {

    List<FoodItem> foodItemList;
    private Restaurant restaurant;
}

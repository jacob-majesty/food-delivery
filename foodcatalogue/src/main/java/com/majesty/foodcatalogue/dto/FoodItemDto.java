package com.majesty.foodcatalogue.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemDto {

    private int id;
    private String itemName;
    private String itemDescription;
    private boolean isVegetable;
    private Number price;
    private Integer restaurantId;
    private Integer quantity;
}

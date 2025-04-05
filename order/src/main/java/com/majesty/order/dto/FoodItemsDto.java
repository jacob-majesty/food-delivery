package com.majesty.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodItemsDto {

    private int id;
    private String itemName;
    private String itemDescription;
    private boolean isVegetarian;
    private Long price;
    private Integer restaurantId;
    private Integer quantity;
}

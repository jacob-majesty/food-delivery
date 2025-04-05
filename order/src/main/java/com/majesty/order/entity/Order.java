package com.majesty.order.entity;

import com.majesty.order.dto.FoodItemsDto;
import com.majesty.order.dto.Restaurant;
import com.majesty.order.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "order")
public class Order {

    private Integer orderId;
    private List<FoodItemsDto> foodItemsList;
    private Restaurant restaurant;
    private UserDto userDto;
}

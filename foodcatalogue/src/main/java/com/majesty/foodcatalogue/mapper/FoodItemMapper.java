package com.majesty.foodcatalogue.mapper;

import com.majesty.foodcatalogue.dto.FoodItemDto;
import com.majesty.foodcatalogue.entity.FoodItem;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FoodItemMapper {

    FoodItemMapper INSTANCE = Mappers.getMapper(FoodItemMapper.class);

    FoodItem mapFoodItemDtoToFoodItem(FoodItemDto foodItemDto);

    FoodItemDto mapFoodItemToFoodItemDto(FoodItem foodItem);
}

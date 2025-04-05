package com.majesty.order.mapper;

import com.majesty.order.dto.OrderDto;
import com.majesty.order.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order mapOrderDtoToOrder(OrderDto orderDto);
    OrderDto mapOrderToOrderDto(Order order);
}

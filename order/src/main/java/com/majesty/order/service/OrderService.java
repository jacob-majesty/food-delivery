package com.majesty.order.service;

import com.majesty.order.dto.OrderDto;
import com.majesty.order.dto.OrderDtoFromFE;
import com.majesty.order.dto.UserDto;
import com.majesty.order.entity.Order;
import com.majesty.order.mapper.OrderMapper;
import com.majesty.order.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final SequenceGenerator sequenceGenerator;
    private final RestTemplate restTemplate;

    public OrderService(OrderRepository orderRepository, SequenceGenerator sequenceGenerator, RestTemplate restTemplate) {
        this.orderRepository = orderRepository;
        this.sequenceGenerator = sequenceGenerator;
        this.restTemplate = restTemplate;
    }

    public OrderDto saveOrderInDb(OrderDtoFromFE orderDetails) {
        Integer newOrderID = sequenceGenerator.generateNextOrderId();
        UserDto userDto = null;
        Order orderToBeSaved = new Order(newOrderID, orderDetails.getFoodItemsList(),
                orderDetails.getRestaurant(), userDto);
            orderRepository.save(orderToBeSaved);
            return OrderMapper.INSTANCE.mapOrderToOrderDto(orderToBeSaved);
    }

    private UserDto fetchUserDetailsFromUserId(Integer userId) {
        return restTemplate.getForObject("http://USER-SERVICE/user/fetchUserById/" + userId, UserDto.class);
    }
}

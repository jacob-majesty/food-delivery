package com.majesty.order.controller;

import com.majesty.order.dto.OrderDto;
import com.majesty.order.dto.OrderDtoFromFE;
import com.majesty.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {

    @Autowired
    OrderService orderservice;

    @PostMapping("/saveOrder")
    public ResponseEntity<OrderDto> saveOrder(@RequestBody OrderDtoFromFE orderDetails) {
        OrderDto orderSavedInDB = orderservice.saveOrderInDb(orderDetails);
        return new ResponseEntity<>(orderSavedInDB, HttpStatus.CREATED);
    }
}

package com.orderService.orderservice.repository;

import com.orderService.orderservice.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepo extends MongoRepository<Order, Long> {
}

package com.web.webproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.webproject.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}

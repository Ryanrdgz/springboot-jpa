package com.web.webproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.webproject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}

package com.web.webproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.webproject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}

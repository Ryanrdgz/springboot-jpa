package com.web.webproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.webproject.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}

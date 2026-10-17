package com.web.webproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.webproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

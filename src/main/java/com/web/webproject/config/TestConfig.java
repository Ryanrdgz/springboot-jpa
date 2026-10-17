package com.web.webproject.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.web.webproject.entities.User;
import com.web.webproject.repositories.UserRepository;

@Configuration 
@Profile("test")
public class TestConfig implements CommandLineRunner{ //classe para instanciar o banco de dados
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        
       User u1 = new User(null, "Maria", "maria@gmail.com", "99999999", "12345");
       User u2 = new User(null, "Alex Codex", "alex@gmail.com", "88888888", "67890");

       userRepository.saveAll(Arrays.asList(u1, u2));
    }
}

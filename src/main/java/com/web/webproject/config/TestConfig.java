package com.web.webproject.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.web.webproject.entities.Category;
import com.web.webproject.entities.Order;
import com.web.webproject.entities.OrderStatus;
import com.web.webproject.entities.User;
import com.web.webproject.repositories.CategoryRepository;
import com.web.webproject.repositories.OrderRepository;
import com.web.webproject.repositories.UserRepository;

@Configuration 
@Profile("test")
public class TestConfig implements CommandLineRunner{ //classe para instanciar o banco de dados
    
    @Autowired
    private UserRepository userRepository;

    @Autowired 
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        
       User u1 = new User(null, "Maria", "maria@gmail.com", "99999999", "12345");
       User u2 = new User(null, "Alex Codex", "alex@gmail.com", "88888888", "67890");

       //parse instanciando o instant no formato ISO 8601
       Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1); 
       Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
       Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

       Category cat1 = new Category(null, "Eletronics");
       Category cat2 = new Category(null, "Books");
       Category cat3 = new Category(null, "Computers");

       // mandando salvar no banco de dados
       userRepository.saveAll(Arrays.asList(u1, u2));
       orderRepository.saveAll(Arrays.asList(o1,o2,o3));
       categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
    }
}

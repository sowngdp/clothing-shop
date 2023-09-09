package com.ecommerce.clothing_shop.service;

import com.ecommerce.clothing_shop.entity.User;
import com.ecommerce.clothing_shop.repository.ICrudRepository;
import com.ecommerce.clothing_shop.repository.UserRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@RequestScoped
public class HelloService {
    @Inject CurrentUserService currentUserService;
    @Inject
    ICrudRepository<User, String> userRepository;
    public HelloService() {

    }
    public String createHelloMessage(String name) {
        return "Hello " + name + "!";
    }
    public String createHelloMessage( ) {
        return "Hello " + currentUserService.getCurrentUser().orElse(new User()).getId() + "!";
    }
}

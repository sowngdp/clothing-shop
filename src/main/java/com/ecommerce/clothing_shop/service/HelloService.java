package com.ecommerce.clothing_shop.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@Named
@ApplicationScoped
public class HelloService {
    public String createHelloMessage(String name) {
        return "Hello " + name + "!";
    }
}

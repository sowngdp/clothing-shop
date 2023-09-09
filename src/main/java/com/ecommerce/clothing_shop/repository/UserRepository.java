package com.ecommerce.clothing_shop.repository;

import com.ecommerce.clothing_shop.entity.User;
import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class UserRepository extends SimpleRepository<User, String> {

}

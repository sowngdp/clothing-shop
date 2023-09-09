package com.ecommerce.clothing_shop.service;

import com.ecommerce.clothing_shop.entity.User;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;


@Named
@RequestScoped
@Getter
public class CurrentUserService {
    private Optional<User> currentUser = Optional.empty();
    public void setCurrentUser(User user) {
        currentUser = Optional.ofNullable(user);
    }

}

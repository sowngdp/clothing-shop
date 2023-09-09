package com.ecommerce.clothing_shop.util;

import jakarta.enterprise.inject.Disposes;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Qualifier;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



public class EntityManagerProducer {

    @Produces
    @PersistenceContext(unitName = "default")
    @MySQLDatabase
    private EntityManager entityManager;
    public void close(
            @Disposes @MySQLDatabase EntityManager entityManager) {
        entityManager.close();
    }
}
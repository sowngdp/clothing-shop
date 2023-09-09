package com.ecommerce.clothing_shop.util;

import org.hibernate.SessionFactory;


public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        //persistence.xml
        var configuration = new org.hibernate.cfg.Configuration();
        sessionFactory = configuration.configure("/META-INF/persistence.xml").buildSessionFactory();
        return sessionFactory;
    }
}

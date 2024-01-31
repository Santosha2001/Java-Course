package com.xworkz.jpa.util;

import lombok.Getter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class EntityManagerFactoryUtil {
    @Getter
    private static EntityManagerFactory entityManagerFactory;

    static {
        entityManagerFactory = Persistence.createEntityManagerFactory("x-workz");
    }
}

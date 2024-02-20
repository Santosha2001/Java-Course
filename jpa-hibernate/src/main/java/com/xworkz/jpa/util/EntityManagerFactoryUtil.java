package com.xworkz.jpa.util;


import lombok.Getter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryUtil {


    @Getter
    private static EntityManagerFactory factory;

    static {
        factory = Persistence.createEntityManagerFactory("x-workz");
        System.out.println("EntityManagerFactory created using Singleton.");
    }

}

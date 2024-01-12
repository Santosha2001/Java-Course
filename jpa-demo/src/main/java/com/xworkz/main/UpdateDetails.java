package com.xworkz.main;

import com.xworkz.entity.SuperHeroEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateDetails {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("x-workz");
        System.out.println("EntityManagerFactory created."+factory);

        EntityManager manager = factory.createEntityManager();
        System.out.println("EntityManager created: "+manager);

        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        System.out.println("EntityTransaction: "+transaction);

        SuperHeroEntity hero=manager.find(SuperHeroEntity.class,1);
        if (hero!=null){
            hero.setWikeness("Drinking");
            manager.merge(hero);
        }
        else
            System.out.println("Can't update.");

        transaction.commit();
        manager.close();
        factory.close();

    }
}

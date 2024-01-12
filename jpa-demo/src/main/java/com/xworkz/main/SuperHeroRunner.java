package com.xworkz.main;

import com.xworkz.entity.SuperHeroEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SuperHeroRunner {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("x-workz");
        System.out.println("EntityManagerFactory "+factory);

        EntityManager manager=factory.createEntityManager();
        System.out.println("EntityManager "+manager);

        EntityTransaction transaction=manager.getTransaction();
        System.out.println("EntityTransaction "+transaction);

        transaction.begin();

        SuperHeroEntity hero=new SuperHeroEntity(5,"Rakshith shetty","simple star","India","acting","rashmika mandanna");
        System.out.println("Details saved: "+hero);

        manager.persist(hero);

        System.out.println("Transaction committed ");

        SuperHeroEntity hero1 = manager.find(SuperHeroEntity.class, 5);
        System.out.println("Entity found: "+hero1);

        transaction.commit();

        manager.close();
        factory.close();
        System.out.println("EMF and EM are closed.");
    }
}

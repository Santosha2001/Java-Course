package com.xworkz.jpa.repository;

import com.xworkz.jpa.entities.TempleEntity;
import com.xworkz.jpa.util.EntityManagerFactoryUtil;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class TempleRepositoryImpl implements TempleRepository {
    private EntityManagerFactory factory = EntityManagerFactoryUtil.getFactory();


    @Override
    public void save(TempleEntity templeEntity) {
        EntityManager manager = factory.createEntityManager();
        System.out.println("EntityManager created: " + manager);
        EntityTransaction transaction = manager.getTransaction();
        System.out.println("EntityTransaction created: " + transaction);

        try {
            transaction.begin();
            System.out.println("transaction started.");
            manager.persist(templeEntity);
            transaction.commit();
            System.out.println("Transaction committed.");
        } catch (PersistenceException e) {
            System.out.println("PersistenceException: " + e.getMessage());
            transaction.rollback();
        } finally {
            manager.close();
            System.out.println("EntityManager closed.");
        }
    }

    @Override
    public List<TempleEntity> findAllByLocation(String location) {
        EntityManager manager = factory.createEntityManager();
        System.out.println("EntityManager created: " + manager);
        List<TempleEntity> list = new ArrayList<>();
        try {
            Query findAllByLocation = manager.createNamedQuery("findAllByLocation");
            Query query = findAllByLocation.setParameter("location", location);
            list = query.getResultList();
            list.forEach(System.out::println);
        } catch (PersistenceException e) {
            System.err.println("PersistenceException: " + e.getMessage());
        }
        return list;
    }


}

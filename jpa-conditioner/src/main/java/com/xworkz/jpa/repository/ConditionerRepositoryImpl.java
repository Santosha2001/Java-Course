package com.xworkz.jpa.repository;

import com.xworkz.jpa.entites.ConditionerEntity;
import com.xworkz.jpa.util.EntityManagerFactoryUtil;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class ConditionerRepositoryImpl implements ConditionerRepository {

    private final EntityManagerFactory factory = EntityManagerFactoryUtil.getEntityManagerFactory();

    @Override
    public void save(ConditionerEntity conditioner) {
        EntityManager manager = factory.createEntityManager();
        System.out.println("EntityManager: " + manager);
        EntityTransaction transaction = manager.getTransaction();
        System.out.println("EntityTransaction created: " + transaction);
        try {
            transaction.begin();
            System.out.println("Transaction started.");
            manager.persist(conditioner);
            transaction.commit();
            System.out.println("Transaction committed.");
        } catch (PersistenceException e) {
            System.err.println("PersistenceException: " + e.getMessage());
            transaction.rollback();
        } finally {
            manager.close();
            System.out.println("EntityManager closed.");
        }

    }

    @Override
    public void saveAll(List<ConditionerEntity> conditionerEntities) {
        EntityManager manager = factory.createEntityManager();
        System.out.println("EntityManager: " + manager);
        EntityTransaction transaction = manager.getTransaction();
        System.out.println("EntityTransaction created: " + transaction);
        try {
            transaction.begin();
            System.out.println("Transaction started.");
            for (ConditionerEntity entity:conditionerEntities){
                manager.persist(entity);
            }
            System.out.println("Persisted.");
            transaction.commit();
            System.out.println("Transaction committed.");
            conditionerEntities.forEach(System.out::println);
        } catch (PersistenceException e) {
            System.err.println("PersistenceException: " + e.getMessage());
            transaction.rollback();
        } finally {
            manager.close();
            System.out.println("EntityManager closed.");
        }
    }

    @Override
    public void updateNetQuantityByBrand(String brand, double netQuantity) {
        EntityManager manager = factory.createEntityManager();
        System.out.println("EntityManager: " + manager);
        EntityTransaction transaction = manager.getTransaction();
        System.out.println("EntityTransaction created: " + transaction);
        try {
            transaction.begin();
            System.out.println("EntityTransaction started.");
            Query query = manager.createNamedQuery("updateNetQuantityByBrand");
            query.setParameter("netQuantity", netQuantity);
            query.setParameter("brand", brand);
            int i = query.executeUpdate();
            transaction.commit();
            System.out.println("Transaction committed.");
            System.out.println(i);
            System.out.println("updated.");
        } catch (PersistenceException e) {
            System.err.println("PersistenceException: " + e.getMessage());
            transaction.rollback();
        } finally {
            manager.close();
            System.out.println("EntityManager closed.");
        }
    }

    @Override
    public void updateRecommendedForByBrand(String brand, String recommendedFor) {
        EntityManager manager = factory.createEntityManager();
        System.out.println("EntityManager: " + manager);
        EntityTransaction transaction = manager.getTransaction();
        System.out.println("EntityTransaction created: " + transaction);

        try {
            transaction.begin();
            System.out.println("Transaction started.");
            Query query = manager.createNamedQuery("updateRecommendedForByBrand");
            query.setParameter("recommend", recommendedFor);
            query.setParameter("brand", brand);
            int i = query.executeUpdate();
            System.out.println(i);
            transaction.commit();
            System.out.println("Transaction committed.");
        } catch (PersistenceException e) {
            System.err.println("PersistenceException: " + e.getMessage());
            transaction.rollback();
        } finally {
            manager.close();
            System.out.println("EntityManager closed.");
        }

    }

    @Override
    public List<ConditionerEntity> findAllByBrand(String brand) {
        EntityManager manager = factory.createEntityManager();
        List<ConditionerEntity> list = new ArrayList<>();
        try {
            Query findAllByBrand = manager.createNamedQuery("findAllByBrand");
            Query query = findAllByBrand.setParameter("brand", brand);
            list = query.getResultList();
            list.forEach(System.out::println);
        } catch (PersistenceException e) {
            System.err.println("PersistenceException: " + e.getMessage());
        } finally {
            manager.close();
            System.out.println("EntityManager closed.");
        }
        return list;
    }

    @Override
    public List<ConditionerEntity> findAllByHairType(String hairType) {
        EntityManager manager = factory.createEntityManager();
        System.out.println("EntityManager: " + manager);
        List<ConditionerEntity> list = new ArrayList<>();
        try {
            Query findAllByHairType = manager.createNamedQuery("findAllByHairType");
            Query query = findAllByHairType.setParameter("hairType", hairType);
            list = query.getResultList();
            list.forEach(System.out::println);
        } catch (PersistenceException e) {
            System.err.println("PersistenceException: " + e.getMessage());
        } finally {
            manager.close();
            System.out.println("EntityManager closed.");
        }
        return list;
    }

    @Override
    public String findScentById(int id) {
        EntityManager manager = factory.createEntityManager();
        System.out.println("EntityManager: " + manager);
        String singleResult = null;
        try {
            Query findScentById = manager.createNamedQuery("findScentById");
            Query query = findScentById.setParameter("id", id);
            singleResult = (String) query.getSingleResult();
            System.out.println(singleResult);
        } catch (PersistenceException e) {
            System.err.println("PersistenceException: " + e.getMessage());
        } finally {
            manager.close();
        }
        return singleResult;
    }

    @Override
    public List<Double> getAllSize() {
        EntityManager manager = factory.createEntityManager();
        System.out.println("EntityManager: " + manager);
        List<Double> list = new ArrayList<>();
        try {
            Query query = manager.createNamedQuery("getAllSize");
            list = query.getResultList();
            list.forEach(System.out::println);
        } catch (PersistenceException e) {
            System.err.println("PersistenceException: " + e.getMessage());
        } finally {
            manager.close();
            System.out.println("EntityManager closed");
        }

        return list;
    }

    @Override
    public List<String> getAllBrand() {
        EntityManager manager = factory.createEntityManager();
        System.out.println("EntityManager: " + manager);
        List<String> list = new ArrayList<>();
        try {
            Query query = manager.createNamedQuery("getAllBrand");
            list = query.getResultList();
            list.forEach(System.out::println);
        } catch (PersistenceException e) {
            System.err.println("PersistenceException: " + e.getMessage());
        } finally {
            manager.close();
            System.out.println("EntityManager closed.");
        }
        return list;
    }


}

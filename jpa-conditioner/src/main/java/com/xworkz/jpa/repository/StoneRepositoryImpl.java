package com.xworkz.jpa.repository;

import com.xworkz.jpa.entites.StoneEntity;
import com.xworkz.jpa.util.EntityManagerFactoryUtil;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class StoneRepositoryImpl implements StoneRepository {
    private EntityManagerFactory factory = EntityManagerFactoryUtil.getEntityManagerFactory();

    @Override
    public void save(StoneEntity entity) {
        EntityManager manager = factory.createEntityManager();
        System.out.println("EntityManager created: " + manager);
        EntityTransaction transaction = manager.getTransaction();
        System.out.println("EntityTransaction: " + transaction);

        try {
            transaction.begin();
            System.out.println("Transaction started.");
            manager.persist(entity);
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
    public void saveAll(List<StoneEntity> list) {
        EntityManager manager = factory.createEntityManager();
        System.out.println("EntityManager created: " + manager);
        EntityTransaction transaction = manager.getTransaction();
        System.out.println("EntityTransaction: " + transaction);

        try {
            transaction.begin();
            System.out.println("Transaction started.");
            for (StoneEntity entity : list) {
                manager.persist(entity);
            }
            list.forEach(System.out::println);
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
    public void updateStoneSizeByName(String name, String size) {
        EntityManager manager = factory.createEntityManager();
        System.out.println("EntityManager created: " + manager);
        EntityTransaction transaction = manager.getTransaction();
        System.out.println("EntityTransaction: " + transaction);

        try {
            transaction.begin();
            System.out.println("Transaction started.");
            Query query = manager.createNamedQuery("updateStoneSizeByName");
            query.setParameter("size", size);
            query.setParameter("name", name);
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
    public void deleteById(int id) {
        EntityManager manager = factory.createEntityManager();
        System.out.println("EntityManager created: " + manager);
        EntityTransaction transaction = manager.getTransaction();
        System.out.println("EntityTransaction: " + transaction);

        try {
            transaction.begin();
            System.out.println("Transaction started.");
            Query query = manager.createNamedQuery("deleteById");
            Query query1 = query.setParameter("id", id);
            int i = query1.executeUpdate();
            System.out.println(i);
            transaction.commit();
            System.out.println("Transaction committed.");
            System.out.println("Deleted.");
        } catch (PersistenceException e) {
            System.err.println("PersistenceException: " + e.getMessage());
            transaction.rollback();
        } finally {
            manager.close();
            System.out.println("EntityManager closed.");
        }
    }

    @Override
    public List<StoneEntity> findAllByColor(String color) {
        EntityManager manager = factory.createEntityManager();
        System.out.println("EntityManager created: " + manager);
        List<StoneEntity> list = new ArrayList<>();
        try {
            Query query = manager.createNamedQuery("findAllByColor");
            query.setParameter("color", color);
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
    public List<Integer> findIdByName(String name) {
        EntityManager manager = factory.createEntityManager();
        System.out.println("EntityManager created: " + manager);
        List<Integer> list = new ArrayList<>();
        try {
            Query query = manager.createNamedQuery("findIdByName");
            query.setParameter("name", name);
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
    public List<StoneEntity> findAllByColorSize(String color, String size) {
        EntityManager manager = factory.createEntityManager();
        System.out.println("EntityManager created: " + manager);
        List<StoneEntity> list = new ArrayList<>();
        try {
            Query query = manager.createNamedQuery("findAllByColorSize");
            query.setParameter("color", color);
            query.setParameter("size", size);
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
    public List<StoneEntity> fineAll() {
        EntityManager manager = factory.createEntityManager();
        System.out.println("EntityManager created: " + manager);
        List<StoneEntity> list = new ArrayList<>();
        try {
            Query query = manager.createNamedQuery("findAll");
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
    public StoneEntity findById(int id) {
        EntityManager manager = factory.createEntityManager();
        System.out.println("EntityManager: " + manager);
        StoneEntity stoneEntity = null;
        try {
            CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();
            CriteriaQuery<StoneEntity> criteriaQuery = criteriaBuilder.createQuery(StoneEntity.class);

            Root<StoneEntity> root = criteriaQuery.from(StoneEntity.class);
            criteriaQuery.where(criteriaBuilder.equal(root.get("id"), id));

            stoneEntity = manager.createQuery(criteriaQuery).getSingleResult();
            System.out.println(stoneEntity);

            return stoneEntity;
        } catch (PersistenceException e) {
            System.err.println("PersistenceException: " + e.getMessage());
        } finally {
            manager.close();
            System.out.println("EntityManager closed.");
        }
        return stoneEntity;
    }

    @Override
    public List<StoneEntity> findBySize(String size) {
        EntityManager manager = factory.createEntityManager();
        System.out.println("EntityManager: " + manager);
        List<StoneEntity> stoneEntity = new ArrayList<>();

        try {
            CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();
            CriteriaQuery<StoneEntity> criteriaQuery = criteriaBuilder.createQuery(StoneEntity.class);
            Root<StoneEntity> root = criteriaQuery.from(StoneEntity.class);
            criteriaQuery.where(criteriaBuilder.equal(root.get("stoneSize"), size));
            stoneEntity = manager.createQuery(criteriaQuery).getResultList();
            stoneEntity.forEach(System.out::println);
            return stoneEntity;
        } catch (PersistenceException e) {
            System.err.println("PersistenceException: " + e.getMessage());
        } finally {
            manager.close();
            System.out.println("EntityManager closed.");
        }
        return stoneEntity;
    }

    @Override
    public StoneEntity findByIdAndName(int id) {
        EntityManager manager = factory.createEntityManager();
        System.out.println("EntityManager: " + manager);
        StoneEntity stoneEntity = null;
        try {
            CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();
            CriteriaQuery<StoneEntity> criteriaQuery = criteriaBuilder.createQuery(StoneEntity.class);
            Root<StoneEntity> root = criteriaQuery.from(StoneEntity.class);

            criteriaQuery.where(criteriaBuilder.and(criteriaBuilder.equal(root.get("id"), id),
                    criteriaBuilder.equal(root.get("stoneName"), "Quartz")));

            stoneEntity = manager.createQuery(criteriaQuery).getSingleResult();
            System.out.println(stoneEntity);

            return stoneEntity;
        } catch (PersistenceException e) {
            System.err.println("PersistenceException: " + e.getMessage());
        } finally {
            manager.close();
            System.out.println("EntityManager closed.");
        }
        return stoneEntity;
    }

    @Override
    public List<StoneEntity> findByStoneSizeColorAndName(String size, String color, String name) {
        EntityManager manager = factory.createEntityManager();
        List<StoneEntity> list = new ArrayList<>();
        try {
            CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();
            CriteriaQuery<StoneEntity> criteriaQuery = criteriaBuilder.createQuery(StoneEntity.class);
            Root<StoneEntity> root = criteriaQuery.from(StoneEntity.class);

            criteriaQuery.where(criteriaBuilder.and(criteriaBuilder.equal(root.get("stoneSize"), size),
                    criteriaBuilder.equal(root.get("stoneColor"), color),
                    criteriaBuilder.equal(root.get("stoneName"), name)
            ));
            list = manager.createQuery(criteriaQuery).getResultList();
            list.forEach(System.out::println);
            return list;
        } catch (PersistenceException e) {
            System.err.println("PersistenceException: " + e.getMessage());
        } finally {
            manager.close();
            System.out.println("EntityManager closed");
        }
        return list;
    }


}

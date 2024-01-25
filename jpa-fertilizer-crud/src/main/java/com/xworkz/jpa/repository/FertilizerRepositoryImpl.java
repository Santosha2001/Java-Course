package com.xworkz.jpa.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.jpa.entites.FertilizerEntity;

public class FertilizerRepositoryImpl implements FertilizerRepository {

	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("x-workz");

	@Override
	public Integer save(FertilizerEntity fertilizerEntity) {
		System.out.println("EntityManagerFactory: " + this.entityManagerFactory);

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		System.out.println("EntityManager: " + entityManager);

		EntityTransaction transaction = entityManager.getTransaction();

		try {
			System.out.println("EntityTransaction created: " + transaction);

			transaction.begin();
			System.out.println("EntityTransaction started.");

			entityManager.persist(fertilizerEntity);
			System.out.println("Persist success.");

			transaction.commit();
			System.out.println("Transaction committed.");

			return fertilizerEntity.getId();

		} catch (PersistenceException e) {
			System.out.println("PersistenceException in save method: " + e.getMessage());
			transaction.rollback();
		} finally {
			entityManager.close();
		}

		return null;
	}

	// insert list
	@Override
	public void save(List<FertilizerEntity> fertilizerEntities) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		try {
			transaction.begin();
			fertilizerEntities.forEach(a -> entityManager.persist(a)); // persist the list
			transaction.commit();
			System.out.println("Transaction committed.");

		} catch (PersistenceException e) {
			transaction.rollback();
			System.out.println("PersistenceException: " + e.getMessage());
		} finally {
			entityManager.close();
		}
	}

	// find by id
	@Override
	public void findById(int fertilizerId) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		try {
			System.out.println("EntityManager created: " + entityManager);
			Query findById = entityManager.createNamedQuery("findById");
			Object result = findById.setParameter("ferId", fertilizerId).getSingleResult();
			System.out.println(result);

		} catch (PersistenceException e) {
			System.out.println("PersistenceException: " + e.getMessage());
		} finally {
			entityManager.close();
		}

	}

	// find all
	@Override
	public List<FertilizerEntity> findAll() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		System.out.println("EntityManager created: " + entityManager);
		try {
			Query findAll = entityManager.createNamedQuery("findAll");
			List<FertilizerEntity> resultList = findAll.getResultList();
			resultList.forEach(a -> System.out.println(a));
		} catch (PersistenceException e) {
			System.err.println("PersistenceException: " + e.getMessage());
		}
		return null;
	}
}

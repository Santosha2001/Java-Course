package com.xworkz.jpa.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.jpa.entites.TravelEntity;

public class TravelRepositoryImpl implements TravelRepository {
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("x-workz");

	@Override
	public Integer saveTravel(TravelEntity travelEntity) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		System.out.println("EntityManager: " + entityManager);

		EntityTransaction transaction = entityManager.getTransaction();
		System.out.println();

		try {
			transaction.begin();
			System.out.println("Transaction started.");
			entityManager.persist(travelEntity);
			System.out.println("Persist success");

			transaction.commit();
			return travelEntity.getId();

		} catch (PersistenceException e) {
			transaction.rollback();
			System.out.println("PersistenceException: " + e.getMessage());
		} finally {
			entityManager.close();
			System.out.println("EntityManager closed.");
		}

		return null;

	}
}

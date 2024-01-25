package com.xworkz.jpa.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.jpa.entites.DiseaseEntity;

public class DiseaseRepositoryImpl implements DiseaseRepository {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("x-workz");

	@Override
	public Integer saveDisease(DiseaseEntity diseaseEntity) {
		EntityManager manager = factory.createEntityManager();
		System.out.println("EntityManager created: " + manager);

		EntityTransaction transaction = manager.getTransaction();
		System.out.println("EntityTransaction created: " + transaction);

		try {
			transaction.begin();
			System.out.println("EntityTransaction started.");

			manager.persist(diseaseEntity);
			System.out.println("Persist success.");

			transaction.commit();
			System.out.println("Transaction committed.");

			return diseaseEntity.getId();

		} catch (PersistenceException e) {
			transaction.rollback();
			System.out.println("PersistenceException: " + e.getMessage());
		} finally {
			manager.close();
		}

		return null;

	}
}

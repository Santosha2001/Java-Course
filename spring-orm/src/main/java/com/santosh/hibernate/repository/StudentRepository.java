package com.santosh.hibernate.repository;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.santosh.hibernate.entities.StudentEntity;

@Component
public class StudentRepository {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public int insert(StudentEntity studentEntity) {
		Serializable save = this.hibernateTemplate.save(studentEntity);
		System.out.println("Values inserted.");
		return (int) save;
	}
}

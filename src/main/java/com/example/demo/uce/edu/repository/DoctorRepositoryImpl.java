package com.example.demo.uce.edu.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.edu.repository.modelo.Doctor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class DoctorRepositoryImpl implements DoctorRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Doctor doctor) {
		
		this.entityManager.persist(doctor);
	}

	@Override
	public void actualizar(Doctor doctor) {
		
		this.entityManager.merge(doctor);
	}

}

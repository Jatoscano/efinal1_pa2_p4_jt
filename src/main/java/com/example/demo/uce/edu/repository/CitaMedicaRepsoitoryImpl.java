package com.example.demo.uce.edu.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.edu.repository.modelo.CitaMedica;
import com.example.demo.uce.edu.repository.modelo.Doctor;
import com.example.demo.uce.edu.repository.modelo.Paciente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CitaMedicaRepsoitoryImpl implements CitaMedicaRepsoitory{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarCita(String numeroCita, BigDecimal valorCita, LocalDateTime fechaCita, String lugarCita,
			Doctor doctor, Paciente paciente) {

		this.entityManager.persist(numeroCita);
		this.entityManager.persist(valorCita);
		this.entityManager.persist(fechaCita);
		this.entityManager.persist(lugarCita);
		this.entityManager.persist(doctor);
		this.entityManager.persist(paciente);
		
	}

	@Override
	public void actualizarCita(String numeroCita, String receta, String diagnositico, LocalDateTime fechaProximaCita) {
		
		this.entityManager.merge(numeroCita);
		this.entityManager.merge(diagnositico);
		this.entityManager.merge(receta);
		this.entityManager.merge(fechaProximaCita);
	}

	


}

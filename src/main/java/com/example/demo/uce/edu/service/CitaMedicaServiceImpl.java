package com.example.demo.uce.edu.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.edu.repository.CitaMedicaRepsoitory;
import com.example.demo.uce.edu.repository.modelo.Doctor;
import com.example.demo.uce.edu.repository.modelo.Paciente;

@Service
public class CitaMedicaServiceImpl implements CitaMedicaService{

	@Autowired
	private CitaMedicaRepsoitory citaMedicaRepsoitory;

	@Override
	public void agendarCita(String numeroCita, BigDecimal valorCita, LocalDateTime fechaCita, String lugarCita,
			Doctor doctor, Paciente paciente) {
		
		this.citaMedicaRepsoitory.insertarCita(numeroCita, valorCita, fechaCita, lugarCita, doctor, paciente);
	}

	@Override
	public void guardarCita(String numeroCita, String receta, String diagnositico, LocalDateTime fechaProximaCita) {
		
		this.citaMedicaRepsoitory.actualizarCita(numeroCita, receta, diagnositico, fechaProximaCita);
		
	}
	
	

}

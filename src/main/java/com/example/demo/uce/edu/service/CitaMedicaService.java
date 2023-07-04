package com.example.demo.uce.edu.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.example.demo.uce.edu.repository.modelo.Doctor;
import com.example.demo.uce.edu.repository.modelo.Paciente;

public interface CitaMedicaService {

	public void agendarCita(String numeroCita, 
			                BigDecimal valorCita, 
			                LocalDateTime fechaCita, 
			                String lugarCita, 
			                Doctor doctor, 
			                Paciente paciente);
	
	public void guardarCita(String numeroCita, String receta, String diagnositico, LocalDateTime fechaProximaCita);
}

package com.example.demo.uce.edu.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.example.demo.uce.edu.repository.modelo.Doctor;
import com.example.demo.uce.edu.repository.modelo.Paciente;

public interface CitaMedicaRepsoitory {

	public void insertarCita(String numeroCita, BigDecimal valorCita, LocalDateTime fechaCita, String lugarCita, Doctor doctor, Paciente paciente );
	
	public void actualizarCita(String numeroCita,String receta, String diagnositico, LocalDateTime fechaProximaCita);
}

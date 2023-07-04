package com.example.demo.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.edu.repository.PacienteRepository;
import com.example.demo.uce.edu.repository.modelo.Paciente;
@Service
public class PacienteServiceImpl implements PacienteService{

	@Autowired
	private PacienteRepository pacienteRepository;
	
	@Override
	public void registrar(Paciente paciente) {
		
		this.pacienteRepository.insertar(paciente);
	}

	@Override
	public void guardar(Paciente paciente) {
		
		this.pacienteRepository.actualizar(paciente);
	}

}

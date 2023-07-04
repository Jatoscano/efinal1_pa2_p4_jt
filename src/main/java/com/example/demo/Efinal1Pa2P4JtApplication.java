package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.edu.repository.modelo.CitaMedica;
import com.example.demo.uce.edu.repository.modelo.Doctor;
import com.example.demo.uce.edu.repository.modelo.Paciente;
import com.example.demo.uce.edu.service.CitaMedicaService;
import com.example.demo.uce.edu.service.DoctorService;
import com.example.demo.uce.edu.service.PacienteService;

@SpringBootApplication
public class Efinal1Pa2P4JtApplication implements CommandLineRunner{

	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private PacienteService pacienteService;
	
	@Autowired
	private CitaMedicaService citaMedicaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Efinal1Pa2P4JtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Objetos
		Doctor doctor = new Doctor();
		Paciente paciente = new Paciente();
		CitaMedica citaMedica = new CitaMedica();
		
		List<CitaMedica> citaMedicas = new ArrayList<>();
		
		//Doctor
		doctor.setCedula("1526743689");
		doctor.setApellido("Davila");
		doctor.setNombre("Esteban");
		doctor.setFechaNacimiento(LocalDateTime.of(1980, 10, 23, 12, 00));
		doctor.setNumeroConsultorio("C-01");
		doctor.setCodigoSenescyt("SE-2345");
		doctor.setGenero("Masculino");
		
		this.doctorService.registrar(doctor);
		this.doctorService.guardar(doctor);
		
		//Paciente
		
		paciente.setCedula("1728364758");
		paciente.setApellido("Sevilla");
		paciente.setNombre("Carlos");
		paciente.setFechaNacimiento(LocalDateTime.of(1995, 2, 10, 13, 05));
		paciente.setCodigoSeguro("AF-230");
		paciente.setEstatura("1.76");
		paciente.setPeso("80 kg");
		paciente.setGenero("Masculino");
		
		this.pacienteService.registrar(paciente);
		this.pacienteService.guardar(paciente);
		
		//Cita Medica
		citaMedica.setNumeroCita("CI-001");
		citaMedica.setFechaCita(LocalDateTime.of(2023, 7, 12, 14, 0));
		citaMedica.setValorCita(new BigDecimal(60));
		citaMedica.setLugarCita("Cosultorio San Benito");
		citaMedica.setDiagnositco("Sintomas de Gripe");
		citaMedica.setReceta("Hibuprofeno 600");
		citaMedica.setFechaProximaCita(LocalDateTime.of(2023, 7, 15, 14, 0));
		
		
		this.citaMedicaService.agendarCita("CI-001", new BigDecimal(60),LocalDateTime.of(2023, 7, 12, 14, 0) , "Cosultorio San Benito", doctor, paciente);
		this.citaMedicaService.guardarCita("CI-001", "Hibuprofeno 600", "Sintomas de Gripe", LocalDateTime.of(2023, 7, 15, 14, 0));
	}
	
	

}

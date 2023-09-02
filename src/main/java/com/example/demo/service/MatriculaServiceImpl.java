package com.example.demo.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IEstudianteRepository;
import com.example.demo.repository.IMateriaRepository;
import com.example.demo.repository.IMatriculaRepository;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;

import com.example.demo.repository.modelo.dto.MatriculaDto;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service

public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository iMatriculaRepository;

	@Autowired
	private IMateriaRepository iMateriaRepository;
	
	@Autowired
	private IEstudianteRepository estudianteRepository;

	@Override
	
	public void matricular(Matricula matricula) {
	
		Estudiante estudiante=this.estudianteRepository.encontrarPorCedula(matricula.getEstudiante().getCedula());
		
		
		
		Materia materia =this.iMateriaRepository.encontrarPorCodigo(matricula.getMateria().getCodigo());
	
		Matricula matricula2= new Matricula();
		for(int i =1;i<=4;i++) {
			matricula2.setNombreHilo("Hilo" + i);
			matricula2.setEstudiante(estudiante);
			matricula2.setFecha(LocalDate.now());
			
			matricula2.setMateria(materia);
			
			
			
			this.iMatriculaRepository.insertar(matricula2);
		}
		
		
	
			
			
			
			
			
		

	}

	@Override
	public List<MatriculaDto> buscarTodos() {
		// TODO Auto-generated method stub
		return this.iMatriculaRepository.encontrarTodos();
	}



}

package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.dto.MatriculaDto;

public interface IMatriculaRepository {

	public void insertar(Matricula matricula);
	
	public List<MatriculaDto> encontrarTodos();
	
}

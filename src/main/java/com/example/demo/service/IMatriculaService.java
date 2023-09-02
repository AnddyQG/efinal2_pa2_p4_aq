package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Matricula;

import com.example.demo.repository.modelo.dto.MatriculaDto;

public interface IMatriculaService {
	public void matricular(Matricula matricula);

	
	public List<MatriculaDto> buscarTodos();
	
}

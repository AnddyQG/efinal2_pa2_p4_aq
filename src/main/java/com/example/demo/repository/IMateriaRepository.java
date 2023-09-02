package com.example.demo.repository;

import com.example.demo.repository.modelo.Materia;

public interface IMateriaRepository {

	public void insertar(Materia materia);
	
	public Materia encontrarPorCodigo(String codigo);
	
}

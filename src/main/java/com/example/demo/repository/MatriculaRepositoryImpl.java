package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.dto.MatriculaDto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;
@Repository
@Transactional

public class MatriculaRepositoryImpl implements IMatriculaRepository{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.entityManager.persist(matricula);
	}

	@Override
	public List<MatriculaDto> encontrarTodos() {
		String jpql="SELECT new com.example.demo.repository.modelo.dto.MatriculaDto(m.estudiante.cedula , m.materia.nombre, m.materia.cedula,m.nombreHilo)FROM Matricula m";
		TypedQuery<MatriculaDto>query=this.entityManager.createQuery(jpql,MatriculaDto.class);
		
		return query.getResultList();
	}

}

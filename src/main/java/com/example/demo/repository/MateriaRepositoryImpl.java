package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;
@Repository
@Transactional

public class MateriaRepositoryImpl implements IMateriaRepository{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	@Transactional(value = TxType.MANDATORY)
	public void insertar(Materia materia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(materia);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public Materia encontrarPorCodigo(String codigo) {
		String jpql="SELECT m FROM Materia m WHERE m.codigo =:datoCodigo";
		
		TypedQuery<Materia>query=this.entityManager.createQuery(jpql,Materia.class);
		query.setParameter("datoCodigo", codigo);
		return query.getSingleResult();
	}

}

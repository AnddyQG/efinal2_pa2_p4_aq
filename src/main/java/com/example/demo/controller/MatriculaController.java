package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.dto.MatriculaDto;
import com.example.demo.service.IMateriaService;
import com.example.demo.service.IMatriculaService;

@Controller
@RequestMapping("/matriculas")
public class MatriculaController {

	@Autowired
	private IMatriculaService iMatriculaService;
	
	@Autowired
	private IMateriaService iMateriaService;
	
	@GetMapping("/vistaMatricula")
	public String vistaMatricula(Matricula matricula) {
		
		
		return "vistaInsertarMatricula";
	}
	@PostMapping("/insertar")
	public String insertarMatricula(Matricula matricula) {

			this.iMatriculaService.matricular(matricula);
		
		
		return "redirect:/matriculas/vistaMatricula";
	}
	
	@GetMapping("/listaMatricula")
	public String listaMatricula(Model model) {
		
		List<MatriculaDto>dtos=this.iMatriculaService.buscarTodos();
		model.addAttribute("dtos",dtos);
		
		return "vistaListaMatricula";
	}
	
}

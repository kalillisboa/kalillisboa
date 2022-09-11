package br.com.cassi.funcionarios.controller;

import java.util.List;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cassi.funcionarios.dto.RequisicaoSquad;
import br.com.cassi.funcionarios.model.*;
import br.com.cassi.funcionarios.repository.SquadRepository;



@RequestMapping("squad")
@Controller
public class SquadController {
	


	
	
	@Autowired
	private SquadRepository repositorio;
	
	
	
	
	@GetMapping("listarsquad")
	
	public String Squad(Model model) {
		
		
		List <Squad> squadlista = repositorio.findAll();
		
		model.addAttribute("Squad", squadlista );
		return "/squad/listarsquad";
		
				
	}
	
	
	@GetMapping("cadastrarsquad")
	
	public String Squad() {
		
		return "/squad/cadastrarsquad";
	}
	
	
	@PostMapping ("novasquad")
	
	public String cadastrarSquad(RequisicaoSquad novaSquad) {
		
		Squad squad = novaSquad.toSquad();
		
		repositorio.save(squad);
		
		return "/squad/listarsquad";
	}
	
	
	@RequestMapping("/deletar/{id}")
	
	public String deletarSquad (@PathVariable  ("id") Long id) {
		
		Squad squad = repositorio.getReferenceById(id);
		
		repositorio.delete(squad);
		
		return "/squad/listarsquad";
	}
	
	

}

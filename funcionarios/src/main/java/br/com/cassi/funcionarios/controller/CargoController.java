package br.com.cassi.funcionarios.controller;

import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.cassi.funcionarios.dto.RequisicaoCargo;
import br.com.cassi.funcionarios.model.Cargo;
import br.com.cassi.funcionarios.repository.CargoRepository;


@RequestMapping("cargo")
@Controller
public class CargoController {


	@Autowired
	private CargoRepository repositorio;
	
	
	
	@RequestMapping("listarcargo")
	
	public String listaCargo(Model model) {
		
		List<Cargo> cargo = repositorio.findAll();
		model.addAttribute("Cargo", cargo);
		
		return "/cargo/listacargo";
	}
	
	
	
	@RequestMapping("cadastrarcargo")
	public String cadastrarCargo() {
		
		return "/cargo/cadastrarcargo";
	}
	
	
	@PostMapping("novocargo")
	
	public String cadastroCargo ( RequisicaoCargo requisicao) {
		
		Cargo cargo = requisicao.toCargo();
		
		if(cargo.id_cargo==null) {
		repositorio.save(cargo);
		
		}
		
		else
		{
			
			cargo = requisicao.alteraCargo(repositorio);
			repositorio.save(cargo);
			
		}
			
	
		
		return "redirect:/cargo/listarcargo";
	}
	
	
	
	@RequestMapping("deletar/{id}")
	
	public String deletarCargo(@PathVariable ("id") Long id) {
		
		Cargo cargo = repositorio.getReferenceById(id);
		repositorio.delete(cargo);
				
		
		return "redirect:/cargo/listarcargo";
	}
	
	
	
	@GetMapping("alterar/{id}")
	
	public String alterarCargo( @PathVariable("id") Long id, Model model){
		
		Optional<Cargo> cargo = repositorio.findById(id);
		
		model.addAttribute("Cargo", cargo.get());
		
			
		return "/cargo/alterarcargo";
	}
	
	
	
	
	
	
}

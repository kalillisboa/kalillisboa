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
import br.com.cassi.funcionarios.dto.RequisicaoFuncionario;
import br.com.cassi.funcionarios.model.Cargo;
import br.com.cassi.funcionarios.model.Empresa;
import br.com.cassi.funcionarios.model.Funcionario;
import br.com.cassi.funcionarios.model.Squad;
import br.com.cassi.funcionarios.repository.CargoRepository;
import br.com.cassi.funcionarios.repository.EmpresaRepository;
import br.com.cassi.funcionarios.repository.FuncionarioRepository;
import br.com.cassi.funcionarios.repository.SquadRepository;

@RequestMapping("")
@Controller
public class FuncionarioController {
	
	
	private FuncionarioRepository repositorio;
	private EmpresaRepository empresa;
	private CargoRepository cargo;
	private SquadRepository squad;
	
	@Autowired
	public void autowired (FuncionarioRepository repositorio, EmpresaRepository empresa, CargoRepository cargo, SquadRepository squad) {
		this.repositorio = repositorio;
		this.empresa = empresa;
		this.cargo= cargo;
		this.squad=squad;
	}
	
	
	@GetMapping("")
	public String Home(Model model) {
		List <Funcionario> funcionariosLista = repositorio.findAll();
		model.addAttribute("Funcionario", funcionariosLista);
		
		return "index";
		 
	 }
	
	
	@GetMapping("funcionarios/cadastrarfuncionario")
	
		public String cadastrar(Model model){
		List<Empresa> empresaLista = empresa.findAll();
		model.addAttribute("Empresa", empresaLista);
		
		List<Cargo> cargoLista = cargo.findAll();
		model.addAttribute("Cargo", cargoLista);
		
		List <Squad> squadlista = squad.findAll();
		
		model.addAttribute("Squad", squadlista );
		
		
		return "/funcionarios/cadastrarfuncionario";
	
		}
	
	
	@PostMapping("funcionarios/novofuncionario")
	
	public String novo(RequisicaoFuncionario requisicao){
		Funcionario funcionario;
		if(requisicao.getId_funcionario() == null) {
			
			
			funcionario = requisicao.toFuncionario();		
			repositorio.save(funcionario);
		}
			
		
	else {
		
		funcionario = requisicao.alteraFuncionario(repositorio);
			repositorio.save(funcionario);
		}
		
	
	return "redirect:../";

	}
	
	
	
	@GetMapping("/deletar/{id}")
	
	public  String deletar (@PathVariable ("id") Long id) {
		
		Funcionario funcionario = repositorio.getReferenceById(id);
		
		repositorio.delete(funcionario);
		
		
	
		
		return "redirect:../";
	}
	
	@GetMapping("/alterar/{id}")	
	
		public String alterar(@PathVariable ("id") Long id, Model model) {
		
			Funcionario funcionario = repositorio.getReferenceById(id);
		
			List<Empresa> empresaLista = empresa.findAll();
			model.addAttribute("Empresa", empresaLista);
			
			List<Cargo> cargoLista = cargo.findAll();
			model.addAttribute("Cargo", cargoLista);
			
			List <Squad> squadlista = squad.findAll();
			
			model.addAttribute("Squad", squadlista );
			
			
			model.addAttribute(funcionario);
			
			
			return "/funcionarios/alterarfuncionario";
		}
	
	
	@GetMapping("funcionarios/listarFuncionario")
	public String lista(Model model) {
		List <Funcionario> funcionariosLista = repositorio.findAll();
		model.addAttribute("Funcionario", funcionariosLista);
		return "/funcionarios/listarFuncionario";
		 
	 }
	

}

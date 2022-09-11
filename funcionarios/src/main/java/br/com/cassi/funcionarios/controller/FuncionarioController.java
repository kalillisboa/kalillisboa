package br.com.cassi.funcionarios.controller;

import java.util.List;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.cassi.funcionarios.dto.RequisicaoFuncionario;
import br.com.cassi.funcionarios.model.Funcionario;
import br.com.cassi.funcionarios.model.Squad;
import br.com.cassi.funcionarios.repository.FuncionarioRepository;

@RequestMapping("funcionarios")
@Controller
public class FuncionarioController {
	
	@Autowired
	private FuncionarioRepository repositorio;
	
	@GetMapping("listarFuncionario")
	public String Home(Model model) {
		List <Funcionario> funcionariosLista = repositorio.findAll();
		model.addAttribute("Funcionario", funcionariosLista);
		return "funcionarios/listarFuncionario";
		 
	}
	
	
	@GetMapping("cadastrarfuncionario")
	
		public String cadastrar(){
		
		return "funcionarios/cadastrarFuncionario";
	
		}
	
	
	@PostMapping("novofuncionario")
	
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
		
	
	return "funcionarios/listarFuncionario";

	}
	
	
	
	@GetMapping("/deletar/{id}")
	
	public  String deletar (@PathVariable ("id") Long id) {
		
		Funcionario funcionario = repositorio.getReferenceById(id);
		
		repositorio.delete(funcionario);
		
		
	
		
		return "funcionarios/listarFuncionario";
	}
	
	@GetMapping("/alterar/{id}")	
	
		public String alterar(@PathVariable ("id") Long id, Model model) {
		
			Funcionario funcionario = repositorio.getReferenceById(id);
			
			model.addAttribute(funcionario);
			
			
			return "funcionarios/alterarfuncionario";
		}
	
	
	
	

}

package br.com.cassi.funcionarios.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cassi.funcionarios.dto.RequisicaoEmpresa;
import br.com.cassi.funcionarios.model.Empresa;
import br.com.cassi.funcionarios.repository.EmpresaRepository;

@RequestMapping("empresa")
@Controller
public class EmpresaController {
	
	
	
	@Autowired
	private EmpresaRepository repositorio;
	
	
	@RequestMapping("listarempresa")
	
	
	public String empresa (Model model) { 
		
			List<Empresa> empresaLista=repositorio.findAll();
			model.addAttribute("Empresa", empresaLista);
		
		return "/empresa/listarempresa";
	}
	
	
	
	@RequestMapping("cadastrarempresa")
	
	public String cadastrarempresa() {
		
		return "/empresa/cadastrarempresa";
	}
	
	
	@RequestMapping("novaempresa")
		
		public String novaEmpresa(RequisicaoEmpresa requisicao) {
			
			Empresa empresa = requisicao.toEmpresa();
			
			repositorio.save(empresa);
			return "/empresa/listarempresa";
		}
		
	
	
	
	@RequestMapping("/deletar/{id}")
	
	public String deletarEmpresa (@PathVariable ("id") Long id) {
		
		Empresa empresa = repositorio.getReferenceById(id);
		
		repositorio.delete(empresa);
		
		
		return "/empresa/listarempresa";
	}
	
	
	
	
	

}

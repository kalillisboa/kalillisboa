package br.com.cassi.funcionarios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cassi.funcionarios.dto.RequisicaoContrato;
import br.com.cassi.funcionarios.model.Contrato;
import br.com.cassi.funcionarios.model.Empresa;
import br.com.cassi.funcionarios.repository.ContratoRepository;
import br.com.cassi.funcionarios.repository.EmpresaRepository;


@RequestMapping("contratos")
@Controller
public class ContratoController {
	
	private EmpresaRepository empresaRepositorio;
	private ContratoRepository contratoRepositorio;
	
	@Autowired
	public void repositorios (EmpresaRepository empresaRepositorio, ContratoRepository contratoRepositorio) {
		
		this.empresaRepositorio = empresaRepositorio;
		this.contratoRepositorio = contratoRepositorio;
	}
	
	
	
	
	@RequestMapping("cadastrarcontratos")
	
	public String cadastrarContratos(Model model) {
		
		List<Empresa> empresaLista = empresaRepositorio.findAll();
		model.addAttribute("Empresa" , empresaLista);
		
		return "contratos/cadastrocontratos";
	}
	
	
	@PostMapping("novoContrato")
	public String cadastroContratos(RequisicaoContrato requisicao) {
		
		Contrato contrato; 
		
		contrato = requisicao.tocontrato();
		contratoRepositorio.save(contrato);
				
	return "../";
	}
	
	
}

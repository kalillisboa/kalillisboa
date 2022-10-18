package br.com.cassi.funcionarios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
				
	return "redirect:listacontratos";
	}
	
	
	@RequestMapping("listacontratos")	
	public String listaempresa(Model model) {
		
		List<Contrato> listacontratos = contratoRepositorio.findAll();
		model.addAttribute("Contratos", listacontratos);
		
		
		
		return "contratos/listacontratos";
	}
	
	
	@RequestMapping("deletar/{id}")
	public String deletarContrato (@PathVariable ("id") Long id) {
		
		contratoRepositorio.deleteById(id);
		
		
		return "redirect:../listacontratos";
	}
	
	
	@RequestMapping("alterar/{id}")
	public String alterarContrato(@PathVariable ("id") Long id, Model model) {
		
		Contrato contrato = contratoRepositorio.getReferenceById(id);
		List<Empresa> listaEmpresa = empresaRepositorio.findAll();
		
		model.addAttribute("Contrato", contrato);
		model.addAttribute("Empresa",listaEmpresa);
		
		return "contratos/alterarcontrato";
	}
	
	
	
	
	
			
}

package br.com.cassi.funcionarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.cassi.funcionarios.repository.TipoFuncionarioRepository;



@Controller
public class TipoFuncionarioController {
	
	@Autowired
	private TipoFuncionarioRepository repositorio;
	

}

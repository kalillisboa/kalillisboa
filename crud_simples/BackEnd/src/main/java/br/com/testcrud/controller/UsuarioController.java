package br.com.testcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.testcrud.model.RespostaModelo;
import br.com.testcrud.model.Usuario;
import br.com.testcrud.servico.UsuarioServico;

@RestController
@CrossOrigin(origins =  "*")
public class UsuarioController {
	
	
	@Autowired
	private UsuarioServico usuarioServico; 
	
	@DeleteMapping ("/remover/{id}")
	public ResponseEntity<RespostaModelo> remover(@PathVariable long id){
		return usuarioServico.remover(id);
	}

	@PutMapping("/alterar")
	public ResponseEntity<?> alterar(@RequestBody Usuario user){
		return usuarioServico.cadastraralterar(user, "alterar");
	}
	
	@PutMapping("/cadastrar")
	public ResponseEntity<?> cadastrar(@RequestBody Usuario user){
		return usuarioServico.cadastraralterar(user, "cadastrar");
	}
	
	@GetMapping("/listar")
	public Iterable<Usuario> listar (){
		return usuarioServico.listar();
	}
	
	@GetMapping("/")
	public String rota() {
		return "API ESTA FUNCIONANDO";
	}

	
}

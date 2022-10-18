package br.com.estudojavareact.estudojavareact.controle;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudojavareact.estudojavareact.Servico.UsuarioServico;
import br.com.estudojavareact.estudojavareact.modelo.UsuarioModelo;

@RestController
public class UsuarioController {

@Autowired
private UsuarioServico usuarioservico;

@GetMapping("/")
public String login(){

    return "teste";
}


@GetMapping("/listar")
public Iterable<UsuarioModelo> listar(){



    return usuarioservico.listar();
}

@PutMapping("/alterar")
public ResponseEntity<?> alterar (@RequestBody UsuarioModelo usuario_modelo){

    return usuarioservico.cadastrarAlterar(usuario_modelo , "alterar");


}



@PostMapping("/cadastrar")    
public ResponseEntity<?> cadastrar (@RequestBody UsuarioModelo usuario_modelo){

    return usuarioservico.cadastrarAlterar(usuario_modelo , "Cadastrar");


}


@DeleteMapping("/excluir")    
public ResponseEntity<?> excluir (@RequestBody UsuarioModelo usuario_modelo){

    return usuarioservico.excluir(usuario_modelo.getId_usuario());


}


}

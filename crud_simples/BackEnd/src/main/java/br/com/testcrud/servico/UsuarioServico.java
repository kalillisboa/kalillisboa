package br.com.testcrud.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.testcrud.model.RespostaModelo;
import br.com.testcrud.model.Usuario;
import br.com.testcrud.repository.UsuarioRepository;

@Service
public class UsuarioServico {


	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired 
	private RespostaModelo respModelo;


	public Iterable<Usuario> listar(){
		return usuarioRepository.findAll();
	}


	public ResponseEntity<?> cadastraralterar(Usuario user , String acao){

		if(user.getNome_usuario().equals("")) {

			respModelo.setMensagem("O Nome do usuário deve ser preenchido");

			return new ResponseEntity<RespostaModelo>(respModelo, HttpStatus.BAD_REQUEST);

		} else if(user.getEmail().equals("")) {

			respModelo.setMensagem("O E-Mail do usuário deve ser preenchido");

			return new ResponseEntity<RespostaModelo>(respModelo, HttpStatus.BAD_REQUEST);

		} else {
			if(acao.equals("cadastrar")) {
				return new ResponseEntity<Usuario>(usuarioRepository.save(user), HttpStatus.CREATED);
			}

			else { 
				return new ResponseEntity<Usuario>(usuarioRepository.save(user), HttpStatus.OK);
			}
		}
	}

	
	public ResponseEntity<RespostaModelo> remover(long id){
		
		usuarioRepository.deleteById(id);
		respModelo.setMensagem("O usuário foi removido com sucesso");
		
		return new ResponseEntity<RespostaModelo>(respModelo , HttpStatus.OK);
		
	}
	
}

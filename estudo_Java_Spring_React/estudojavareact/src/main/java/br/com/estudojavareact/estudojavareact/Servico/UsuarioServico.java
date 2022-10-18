package br.com.estudojavareact.estudojavareact.Servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.estudojavareact.estudojavareact.modelo.RespostaModelo;
import br.com.estudojavareact.estudojavareact.modelo.UsuarioModelo;
import br.com.estudojavareact.estudojavareact.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServico {

    @Autowired
    private UsuarioRepositorio usuariorepositorio;

    // metodo para listar todos os usarios//

    public Iterable<UsuarioModelo> listar() {

        return usuariorepositorio.findAll();
    }

    // metodo para cadastrar ou alterar um usuario//

    @Autowired
    private RespostaModelo resposta_modelo;

    public ResponseEntity<?> cadastrarAlterar(UsuarioModelo usuario_modelo, String acao) {

        if (usuario_modelo.getNome_usuario().equals("")) {

            resposta_modelo.setMensagem("O nome do usuário precisa ser preenchidos");

            return new ResponseEntity<RespostaModelo>(resposta_modelo, HttpStatus.BAD_REQUEST);

        } else if (usuario_modelo.getSenha_usuario().equals("")) {

            resposta_modelo.setMensagem("A senha do usuário precisa ser preenchida");

            return new ResponseEntity<RespostaModelo>(resposta_modelo, HttpStatus.BAD_REQUEST);

        }

        else {

            if (acao.equals("cadastrar")) {

                return new ResponseEntity<UsuarioModelo>(usuariorepositorio.save(usuario_modelo), HttpStatus.CREATED);
            } else {

                return new ResponseEntity<UsuarioModelo>(usuariorepositorio.save(usuario_modelo), HttpStatus.OK);
            }

        }

    }

    // Método para remover produto//

    public ResponseEntity<RespostaModelo> excluir(long id) {

        usuariorepositorio.deleteById(id);
        resposta_modelo.setMensagem("O usuário foi removido com sucesso");

        return new ResponseEntity<RespostaModelo>(resposta_modelo, HttpStatus.OK);

    }

}

package br.com.estudojavareact.estudojavareact.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.estudojavareact.estudojavareact.modelo.UsuarioModelo;

@Repository

public interface UsuarioRepositorio extends CrudRepository<UsuarioModelo, Long>  {



    
}

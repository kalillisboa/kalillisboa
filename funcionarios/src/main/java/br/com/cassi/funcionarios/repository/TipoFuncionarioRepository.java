package br.com.cassi.funcionarios.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface TipoFuncionarioRepository extends JpaRepository<TipoFuncionarioRepository, Long> {


	public List<TipoFuncionarioRepository> findAll();
	
}

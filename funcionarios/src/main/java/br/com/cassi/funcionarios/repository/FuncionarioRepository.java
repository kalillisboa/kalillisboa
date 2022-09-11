package br.com.cassi.funcionarios.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import br.com.cassi.funcionarios.model.Funcionario;




@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

		
	public List<Funcionario> findAll();

	
	
	
	
	
}



package br.com.cassi.funcionarios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cassi.funcionarios.model.Empresa;


@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	
	
	public List<Empresa> findAll();



}

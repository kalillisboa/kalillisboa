package br.com.cassi.funcionarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cassi.funcionarios.model.TipoFuncionario;

@Repository
public interface TipoFuncionarioRepository extends JpaRepository<TipoFuncionario, Long> {

}

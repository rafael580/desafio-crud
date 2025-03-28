package br.com.desafio.crud.desafio_crud.domain.repository;

import br.com.desafio.crud.desafio_crud.domain.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository  extends JpaRepository<Pessoa,Long> {
}

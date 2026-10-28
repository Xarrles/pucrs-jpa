package br.pucrs.nomeusuario.exemplo.persistencia;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface IAutorJpaItfRep extends CrudRepository<Autor, Long> {
    List<Autor> findAll();
    Autor findByNumero(long numero);
}
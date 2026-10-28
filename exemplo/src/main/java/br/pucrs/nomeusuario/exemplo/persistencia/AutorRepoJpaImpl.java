package br.pucrs.nomeusuario.exemplo.persistencia;

import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AutorRepoJpaImpl implements IAutorRepository {
    private final IAutorJpaItfRep repository;

    @Autowired
    public AutorRepoJpaImpl(IAutorJpaItfRep repository) {
        this.repository = repository;
    }

    @Override
    public List<Autor> getAutores() {
        List<Autor> autores = repository.findAll();
        if (autores.isEmpty())
            autores = new LinkedList<>();
        return autores;
    }

    @Override
    public Autor getAutorNumero(long numero) {
        return repository.findByNumero(numero);
    }
}
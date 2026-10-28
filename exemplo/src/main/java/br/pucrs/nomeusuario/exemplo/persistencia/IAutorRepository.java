package br.pucrs.nomeusuario.exemplo.persistencia;

import java.util.List;

public interface IAutorRepository {
    List<Autor> getAutores();
    Autor getAutorNumero(long numero);
}
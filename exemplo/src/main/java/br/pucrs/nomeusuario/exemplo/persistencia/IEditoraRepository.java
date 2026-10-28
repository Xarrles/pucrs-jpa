package br.pucrs.nomeusuario.exemplo.persistencia;

import java.util.List;

public interface IEditoraRepository {
    List<Editora> getEditoras();
    Editora getEditoraCodigo(long codigo);
    Editora getEditoraNome(String nome);
}


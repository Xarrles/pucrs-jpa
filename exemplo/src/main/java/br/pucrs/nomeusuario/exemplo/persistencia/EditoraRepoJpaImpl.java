package br.pucrs.nomeusuario.exemplo.persistencia;
import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class EditoraRepoJpaImpl implements IEditoraRepository {
    private IEditoraJpaItfRep repository;

    @Autowired
    public EditoraRepoJpaImpl(IEditoraJpaItfRep repository) {
        this.repository = repository;
    }

    @Override
    public List<Editora> getEditoras() {
        List<Editora> editoras = repository.findAll();
        if (editoras.size() == 0) 
            editoras = new LinkedList<Editora>();
        return editoras;
        }

    @Override
    public Editora getEditoraCodigo(long codigo) {
        Editora editora = repository.findById(codigo);
        return editora;
    }

    @Override
    public Editora getEditoraNome(String nome) {
        Editora editora = repository.findByNome(nome);
        return editora;
    }
}
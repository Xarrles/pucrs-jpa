package br.pucrs.nomeusuario.exemplo.apresentacao;

import br.pucrs.nomeusuario.exemplo.persistencia.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/biblioteca")
public class ExemploController {
    private IAcervoRepository acervo;
    private IEditoraRepository editoras;
    private IAutorRepository autores;

    @Autowired
    public ExemploController(IAcervoRepository acervo, IEditoraRepository editoras,
            IAutorRepository autores) {
        this.acervo = acervo;        
        this.editoras = editoras;
        this.autores = autores;
    }

    @GetMapping("")
    public String getMensagemInicial() {
        return "Aplicacao Spring-Boot funcionando!";
    }

    @GetMapping("/livros")
    public List<Livro> getLivros() {
        return acervo.getLivros();
    }

    @GetMapping("/livroid/{id}")
    public Livro getLivroTitulo(@PathVariable("id") long id) {
        return acervo.getLivroId(id);
    }

    @GetMapping("/livrosautor/{autor}")
    public List<Livro> getLivrosAutor(@PathVariable long autor) {
        return acervo.getLivrosAutor(autores.getAutorNumero(autor));
    }

    @GetMapping("/editoras")
    public List<Editora> getEditoras() {
        return editoras.getEditoras();
    }

    @GetMapping("/editoracod/{codigo}")
    public Editora getEditoraCodigo(@PathVariable("codigo") long codigo) {
        return editoras.getEditoraCodigo(codigo);
    }

    @GetMapping("/editoranome/{nome}")
    public Editora getEditoraNome(@PathVariable String nome) {
        return editoras.getEditoraNome(nome);
    }

    @GetMapping("/autores")
    public List<Autor> getAutores() {
        return autores.getAutores();
    }

    @GetMapping("/autornum/{numero}")
    public Autor getAutorNumero(@PathVariable("numero") long numero) {
        return autores.getAutorNumero(numero);
    }

}
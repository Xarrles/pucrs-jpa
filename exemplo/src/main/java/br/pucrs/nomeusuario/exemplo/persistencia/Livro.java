package br.pucrs.nomeusuario.exemplo.persistencia;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Livro {
    @Id
    private long id;
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Editora editora;
    private String titulo;
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JsonBackReference
    private Autor autor;
    private int ano;

    public Livro() {        
    }

    public Livro(long id, Editora editora, String titulo, Autor autor, int ano) {
        this.id = id;
        this.editora = editora;
        this.autor = autor;
        this.titulo = titulo;
        this.ano = ano;
    }

    public long getId() {
        return id;
    }

    public Editora getEditora() {
        return editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

}

package br.pucrs.nomeusuario.exemplo.persistencia;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Autor {
    @Id
    private long numero;
    private String nome;
    private int anoNascimento;

    @OneToMany(mappedBy = "autor")
    @JsonManagedReference
    private List<Livro> livros;

    public Autor() {
    }

    public Autor(long numero, String nome, int anoNascimento) {
        this.numero = numero;
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public long getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public List<Livro> getLivros() {
        return livros;
    }
}
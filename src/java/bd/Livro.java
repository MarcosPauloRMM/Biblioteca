/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.util.Date;

/**
 *
 * @author User
 */
public class Livro {
    private String nomelivro;
    private String autorlivro;
    private Integer anopublicacao;
    private Integer quantidadepaginas;
    private String isbn;    

    Livro(String nomelivro, String autorlivro, Integer anopublicacao, Integer quantidadepaginas, String isbn) {
    this.nomelivro = nomelivro;    
    this.autorlivro = autorlivro;    
    this.anopublicacao = anopublicacao;    
    this.quantidadepaginas = quantidadepaginas;    
    this.isbn = isbn;    
    }

    public String getNomelivro() {
        return nomelivro;
    }

    public void setNomelivro(String nomelivro) {
        this.nomelivro = nomelivro;
    }

    public String getAutorlivro() {
        return autorlivro;
    }

    public void setAutorlivro(String autorlivro) {
        this.autorlivro = autorlivro;
    }

    public Integer getAnopublicacao() {
        return anopublicacao;
    }

    public void setAnopublicacao(Integer anopublicacao) {
        this.anopublicacao = anopublicacao;
    }

    public Integer getQuantidadepaginas() {
        return quantidadepaginas;
    }

    public void setQuantidadepaginas(Integer quantidadepaginas) {
        this.quantidadepaginas = quantidadepaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


}
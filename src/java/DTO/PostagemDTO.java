/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author pedro
 */
public class PostagemDTO {

    private Integer id_usuario;
    private String categoria;
    private String titulo;
    private String conteudo;
    private Boolean liberar; // Liberado pelo usuario
    private Boolean aprovado; // Aprovado pelo admin

    public PostagemDTO(Integer id_usuario, String categoria, String titulo, String conteudo, Boolean liberar, Boolean aprovado) {
        this.id_usuario = id_usuario;
        this.categoria = categoria;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.liberar = liberar;
        this.aprovado = aprovado;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getId_categoria() {
        return categoria;
    }

    public void setId_categoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Boolean getLiberar() {
        return liberar;
    }

    public void setLiberar(Boolean liberar) {
        this.liberar = liberar;
    }

    public Boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(Boolean aprovado) {
        this.aprovado = aprovado;
    }
    
    
}

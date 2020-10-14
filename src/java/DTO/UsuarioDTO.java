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
public class UsuarioDTO {

    private String nome;
    private String cpf;
    private String senha;
    private String email;
    private String grauDeAcesso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGrauDeAcesso() {
        return grauDeAcesso;
    }

    public void setGrauDeAcesso(String grauDeAcesso) {
        this.grauDeAcesso = grauDeAcesso;
    }
}

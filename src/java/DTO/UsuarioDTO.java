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
    private Integer id;
    private String cpf;
    private String nome;
    private String email;
    private String senha;
    private Integer papel;
    private Boolean cadastro_aprovado;
    
    public UsuarioDTO(String cpf, String senha) {
        this.cpf = cpf;
        this.senha = senha;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getPapel() {
        return papel;
    }

    public void setPapel(Integer papel) {
        switch(papel) {
            case 0:
                this.papel = Papel.admin.ordinal();
            case 1:
                this.papel = Papel.autor.ordinal();
            case 2:
                this.papel = Papel.comentarista.ordinal();
        }
    }

    public Boolean getCadastro_aprovado() {
        return cadastro_aprovado;
    }

    public void setCadastro_aprovado(Integer cadastro_aprovado) {
        this.cadastro_aprovado = cadastro_aprovado == 0 ? true : false;
    }

}

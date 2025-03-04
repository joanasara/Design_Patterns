package com.algaworks.contato;

public class ContatoComDesignPatterns {

    private String nome;
    private String email;

    public ContatoComDesignPatterns(String email, String nome) {
        this.email = email;
        this.nome = nome;
    }
    public ContatoComDesignPatterns() {

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
}

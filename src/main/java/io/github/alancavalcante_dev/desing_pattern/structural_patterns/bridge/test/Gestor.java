package io.github.alancavalcante_dev.desing_pattern.structural_patterns.bridge.test;

public class Gestor implements Funcionario {

    public String nome;
    public Integer idade;
    public String email;

    public Gestor(String nome, Integer idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public Integer getIdade() {
        return this.idade;
    }

    @Override
    public String getEmail() {
        return this.email;
    }
}

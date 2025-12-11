package io.github.alancavalcante_dev.desing_pattern.structural_patterns.bridge;

public class GerenteProjeto implements Funcionario {

    public String nome;
    public Integer idade;
    public String email;

    public GerenteProjeto(String nome, Integer idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public Integer getIdade() {
        return idade;
    }

    @Override
    public String getEmail() {
        return email;
    }
}

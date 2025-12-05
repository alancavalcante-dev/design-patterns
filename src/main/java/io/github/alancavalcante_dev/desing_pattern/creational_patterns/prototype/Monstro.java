package io.github.alancavalcante_dev.desing_pattern.creational_patterns.prototype;

import lombok.ToString;

@ToString
public class Monstro implements Cloneable {

    private String nome;
    private String habilidade;
    private Arma arma;

    @Override
    public Monstro clone() throws CloneNotSupportedException {
        Monstro monstro = (Monstro) super.clone();
        if (arma != null) {
            monstro.arma = this.arma.clone();
        }
        return monstro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}

package io.github.alancavalcante_dev.desing_pattern.creational_patterns.prototype;

import lombok.ToString;

@ToString
public class Arma implements Cloneable {

    private String nomeArma;
    private Integer forca;;

    public Arma(String nomeArma, Integer forca) {
        this.nomeArma = nomeArma;
        this.forca = forca;
    }

    @Override
    public Arma clone() throws CloneNotSupportedException {
        return (Arma) super.clone();
    }

    public String getNomeArma() {
        return nomeArma;
    }

    public void setNomeArma(String nomeArma) {
        this.nomeArma = nomeArma;
    }

    public Integer getForca() {
        return forca;
    }

    public void setForca(Integer forca) {
        this.forca = forca;
    }
}

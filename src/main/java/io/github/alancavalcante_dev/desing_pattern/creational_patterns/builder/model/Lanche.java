package io.github.alancavalcante_dev.desing_pattern.creational_patterns.builder.model;


import lombok.ToString;

@ToString
public class Lanche {
    private final Hamburguer hamburguer;
    private final TamanhoBatata tamanhoBatata;
    private final Refrigerante refrigerante;

    private Lanche(Builder builder) {
        if (builder.hamburguer == null) {
            throw new IllegalArgumentException("O Lanche deve ter um Hamburguer.");
        }

        this.hamburguer = builder.hamburguer;
        this.tamanhoBatata = builder.tamanhoBatata;
        this.refrigerante = builder.refrigerante;
    }

    public Hamburguer getHamburguer() {
        return hamburguer;
    }
    public TamanhoBatata getTamanhoBatata() {
        return tamanhoBatata;
    }
    public Refrigerante getRefrigerante() {
        return refrigerante;
    }


    public static class Builder {

        private Hamburguer hamburguer;
        private TamanhoBatata tamanhoBatata;
        private Refrigerante refrigerante;

        public Builder(Hamburguer hamburguer) {
            this.hamburguer = hamburguer;
        }

        public Builder tamanhoBatata(TamanhoBatata tamanho) {
            this.tamanhoBatata = tamanho;
            return this;
        }

        public Builder refrigerante(Refrigerante refri) {
            this.refrigerante = refri;
            return this;
        }

        public Lanche build() {
            return new Lanche(this);
        }
    }
}
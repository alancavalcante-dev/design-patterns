package io.github.alancavalcante_dev.desing_pattern.model;

import lombok.ToString;

@ToString
public class Engine {

    private final Integer cilindradas;
    private final Integer cilindros;
    private final Integer valvulas;


    private Engine(Builder builder) {
        this.cilindradas = builder.cilindradas;
        this.cilindros = builder.cilindros;
        this.valvulas = builder.valvulas;
    }

    public static Builder Builder() {
        return new Builder();
    }

    public static class Builder {
        private Integer cilindradas;
        private Integer cilindros;
        private Integer valvulas;

        public Builder cilindradas(Integer cilindradas) {
            this.cilindradas = cilindradas;
            return this;
        }

        public Builder cilindros(Integer cilindros) {
            this.cilindros = cilindros;
            return this;
        }

        public Builder valvulas(Integer valvulas) {
            this.valvulas = valvulas;
            return this;
        }



        public Engine build() {
            if (valvulas == null || valvulas < 8 || valvulas > 32) {
                throw new IllegalArgumentException(
                        "O número de válvulas (" + valvulas + ") deve estar entre 8 e 32."
                );
            }

            if (cilindradas == null || cilindradas < 160 || cilindradas > 500) {
                throw new IllegalArgumentException(
                        "A cilindrada (" + cilindradas + ") deve estar entre 160 e 500."
                );
            }

            if (cilindros == null || cilindros < 3 || cilindros > 8) {
                throw new IllegalArgumentException(
                        "O número de cilindros (" + cilindros + ") deve estar entre 3 e 8."
                );
            }

            return new Engine(this);
        }
    }

    public Integer getCilindradas() {
        return cilindradas;
    }

    public Integer getCilindros() {
        return cilindros;
    }

    public Integer getValvulas() {
        return valvulas;
    }
}
package io.github.alancavalcante_dev.desing_pattern.factory;

import io.github.alancavalcante_dev.desing_pattern.factory.montadoras.Ferrari;
import io.github.alancavalcante_dev.desing_pattern.factory.montadoras.Ford;
import io.github.alancavalcante_dev.desing_pattern.factory.montadoras.Hyundai;
import io.github.alancavalcante_dev.desing_pattern.model.Car;
import io.github.alancavalcante_dev.desing_pattern.model.Cors;

public class MontadoraCarro {

    public static Car montadora(String montadora, String modelo, Cors cor) {

        if ("Ferrari".equals(montadora)) {
            return new Ferrari(modelo).montarCarro(cor);
        }
        if ("Ford".equals(montadora)) {
            return new Ford(modelo).montarCarro(cor);
        }
        if ("Hyundai".equals(montadora)) {
            return new Hyundai(modelo).montarCarro(cor);
        }
        throw new RuntimeException("Errou a marca ou o modelo");
    }

}

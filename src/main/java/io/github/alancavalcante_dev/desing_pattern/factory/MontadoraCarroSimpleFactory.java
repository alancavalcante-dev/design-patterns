package io.github.alancavalcante_dev.desing_pattern.factory;

import io.github.alancavalcante_dev.desing_pattern.factory.montadoras.Automaker;
import io.github.alancavalcante_dev.desing_pattern.factory.montadoras.Ferrari;
import io.github.alancavalcante_dev.desing_pattern.factory.montadoras.Ford;
import io.github.alancavalcante_dev.desing_pattern.factory.montadoras.Hyundai;

public class MontadoraCarroSimpleFactory {

    public Automaker montadora(String montadora, String modelo) {

        if ("Ferrari".equals(montadora)) {
            return new Ferrari(modelo);
        }
        if ("Ford".equals(montadora)) {
            return new Ford(modelo);
        }
        if ("Hyundai".equals(montadora)) {
            return new Hyundai(modelo);
        }
        throw new RuntimeException();
    }

}

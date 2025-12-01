package io.github.alancavalcante_dev.desing_pattern.factory.montadoras;

import io.github.alancavalcante_dev.desing_pattern.model.Car;
import io.github.alancavalcante_dev.desing_pattern.model.Cors;

public interface Automaker {
    Car montarCarro(Cors cor);
}

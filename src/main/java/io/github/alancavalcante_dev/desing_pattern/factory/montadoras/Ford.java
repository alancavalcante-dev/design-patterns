package io.github.alancavalcante_dev.desing_pattern.factory.montadoras;

import io.github.alancavalcante_dev.desing_pattern.factory.modelosdecarro.FordModels;
import io.github.alancavalcante_dev.desing_pattern.model.Car;
import io.github.alancavalcante_dev.desing_pattern.model.Cors;
import lombok.ToString;

@ToString
public class Ford implements Automaker {
    private FordModels modelChoice;

    public Ford(String modelChoice) {
        for (FordModels model : FordModels.values()) {
            if (model.toString().equals(modelChoice)) {
                this.modelChoice = model;
            }
        }
    }

    @Override
    public Car montarCarro(Cors cor) {
        return null;
    }
}

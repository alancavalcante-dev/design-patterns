package io.github.alancavalcante_dev.desing_pattern.factory.montadoras;

import io.github.alancavalcante_dev.desing_pattern.factory.modelosdecarro.HyundaiModels;
import io.github.alancavalcante_dev.desing_pattern.model.Car;
import io.github.alancavalcante_dev.desing_pattern.model.Cors;
import lombok.ToString;


@ToString
public class Hyundai implements Automaker {

    private HyundaiModels modelChoice;

    public Hyundai(String modelChoice) {
        for (HyundaiModels model : HyundaiModels.values()) {
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

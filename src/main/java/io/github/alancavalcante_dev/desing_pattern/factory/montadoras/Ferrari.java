package io.github.alancavalcante_dev.desing_pattern.factory.montadoras;

import io.github.alancavalcante_dev.desing_pattern.factory.modelosdecarro.FerrariModels;
import io.github.alancavalcante_dev.desing_pattern.model.Car;
import io.github.alancavalcante_dev.desing_pattern.model.Cors;
import io.github.alancavalcante_dev.desing_pattern.model.Engine;
import lombok.ToString;

@ToString
public class Ferrari implements Automaker {

    private String modelChoice;

    public Ferrari(String modelChoice) {
        try {
            for (FerrariModels model : FerrariModels.values()) {
                if (model.toString().equals(modelChoice)) {
                    this.modelChoice = model.toString();
                }
            }
        }
        catch (RuntimeException ex) {
            System.out.println("Errou a marca ou o modelo");
        }

    }

    @Override
    public Car montarCarro(Cors cor) {
        Engine motor = null;

        if (modelChoice.equals(FerrariModels.ENZO.toString())) {
            motor = Engine.Builder()
                    .cilindradas(280)
                    .cilindros(8)
                    .valvulas(24).build();
        }

        if (modelChoice.equals(FerrariModels.ROMA.toString())) {
            motor = Engine.Builder()
                    .cilindradas(240)
                    .cilindros(4)
                    .valvulas(16).build();
        }

        if (modelChoice.equals(FerrariModels.PUROSANGUE.toString())) {
            motor = Engine.Builder()
                    .cilindradas(400)
                    .cilindros(8)
                    .valvulas(32).build();
        }

        return new Car(motor, cor);
    }
}

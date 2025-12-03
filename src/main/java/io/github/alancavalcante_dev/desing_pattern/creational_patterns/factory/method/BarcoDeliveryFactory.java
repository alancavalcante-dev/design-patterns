package io.github.alancavalcante_dev.desing_pattern.creational_patterns.factory.method;

import io.github.alancavalcante_dev.desing_pattern.creational_patterns.factory.method.model.Caminhao;
import io.github.alancavalcante_dev.desing_pattern.creational_patterns.factory.method.model.Veiculo;

public class BarcoDeliveryFactory extends CriarVeiculoTransporte {

    @Override
    Veiculo criarVeiculo() {
        return new Caminhao();
    }

}

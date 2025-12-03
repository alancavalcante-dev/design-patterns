package io.github.alancavalcante_dev.desing_pattern.creational_patterns.factory.method;

import io.github.alancavalcante_dev.desing_pattern.creational_patterns.factory.method.model.Veiculo;

abstract class CriarVeiculoTransporte {

    abstract Veiculo criarVeiculo();

    public Veiculo entregar(String local) {
        Veiculo veiculo = criarVeiculo();
        System.out.println("Veiculo pronto para ir para: " + local);
        return veiculo;
    }

}

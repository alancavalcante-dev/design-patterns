package io.github.alancavalcante_dev.desing_pattern.creational_patterns.factory.simple.model;

public class Caminhao implements Transporte{

    @Override
    public String run() {
        return "Indo até o destino de Caminhão";
    }
}

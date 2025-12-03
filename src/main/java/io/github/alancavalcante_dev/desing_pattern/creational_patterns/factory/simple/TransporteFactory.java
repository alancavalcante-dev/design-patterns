package io.github.alancavalcante_dev.desing_pattern.creational_patterns.factory.simple;


import io.github.alancavalcante_dev.desing_pattern.creational_patterns.factory.simple.model.Barco;
import io.github.alancavalcante_dev.desing_pattern.creational_patterns.factory.simple.model.Caminhao;
import io.github.alancavalcante_dev.desing_pattern.creational_patterns.factory.simple.model.TiposDelivery;
import io.github.alancavalcante_dev.desing_pattern.creational_patterns.factory.simple.model.Transporte;

public class TransporteFactory {

    public static Transporte pegarUmDelivery(TiposDelivery tiposDelivery) {

        if (tiposDelivery == TiposDelivery.CAMINHAO) {
            return new Caminhao();
        }

        if (tiposDelivery == TiposDelivery.BARCO) {
            return new Barco();
        }
        throw new RuntimeException("nenhuma das opções");
    }

}

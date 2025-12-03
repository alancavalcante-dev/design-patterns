package io.github.alancavalcante_dev.desing_pattern.creational_patterns.factory;

import io.github.alancavalcante_dev.desing_pattern.creational_patterns.factory.method.CaminhaoDeliveryFactory;
import io.github.alancavalcante_dev.desing_pattern.creational_patterns.factory.method.model.Produto;
import io.github.alancavalcante_dev.desing_pattern.creational_patterns.factory.method.model.Veiculo;
import io.github.alancavalcante_dev.desing_pattern.creational_patterns.factory.simple.model.TiposDelivery;
import io.github.alancavalcante_dev.desing_pattern.creational_patterns.factory.simple.model.Transporte;
import io.github.alancavalcante_dev.desing_pattern.creational_patterns.factory.simple.TransporteFactory;

import java.util.List;


public class Client {

    public static void main(String[] args) {

        simpleFactory();
        System.out.println();
        factoryMethod();

    }

    public static void simpleFactory() {
        Transporte transporte = TransporteFactory.pegarUmDelivery(TiposDelivery.CAMINHAO);
        System.out.println(transporte.run());
    }

    public static void factoryMethod() {
        List<Produto> produtos = List.of(new Produto("Tomate"), new Produto("Cebola"));

        CaminhaoDeliveryFactory factory = new CaminhaoDeliveryFactory();
        Veiculo caminhao =  factory.entregar("Santana de Paraiba");
        caminhao.carregar(produtos);
        caminhao.enviar();

    }
}

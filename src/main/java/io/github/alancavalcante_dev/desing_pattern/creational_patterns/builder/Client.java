package io.github.alancavalcante_dev.desing_pattern.creational_patterns.builder;


import io.github.alancavalcante_dev.desing_pattern.creational_patterns.builder.model.*;

public class Client {

    public static void main(String[] args) {

        Lanche lanche = new Lanche.Builder(Hamburguer.BigMac)
                .tamanhoBatata(TamanhoBatata.GRANDE)
                .refrigerante(Refrigerante.ColaCola)
                .build();

        System.out.println(lanche);
    }
}

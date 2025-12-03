package io.github.alancavalcante_dev.desing_pattern.creational_patterns.factory.method.model;

import java.util.List;

public class Barco implements Veiculo {
    @Override
    public void carregar(List<Produto> carrega) {
        System.out.println("Carregando:" + carrega);
    }

    @Override
    public void enviar() {
        System.out.println("Em rota");
    }
}

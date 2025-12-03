package io.github.alancavalcante_dev.desing_pattern.creational_patterns.factory.method.model;

import java.util.List;

public class Caminhao implements Veiculo {

    @Override
    public void carregar(List<Produto> carrega) {
        StringBuilder text = new StringBuilder("Carregando: ");
        for (Produto produto:carrega) {
            text.append(" ").append(produto.nome);
        }
        System.out.println(text);
    }

    @Override
    public void enviar() {
        System.out.println("Em rota");
    }
}

package io.github.alancavalcante_dev.desing_pattern.creational_patterns.factory.method.model;

import java.util.List;

public interface Veiculo {

    void carregar(List<Produto> carrega);
    void enviar();

}

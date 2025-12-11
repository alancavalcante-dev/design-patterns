package io.github.alancavalcante_dev.desing_pattern.structural_patterns.adapter;

public class AntenaAdapter implements Cabo {

    private AntenaVelha antena;

    public AntenaAdapter(AntenaVelha antena) {
        this.antena = antena;
    }

    @Override
    public void enviarDado() {
        antena.emitirSinaisDeRadio();
    }
}

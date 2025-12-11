package io.github.alancavalcante_dev.desing_pattern.structural_patterns.adapter;

public class Vga implements Cabo {

    @Override
    public void enviarDado() {
        System.out.println("Enviando video");
    }
}

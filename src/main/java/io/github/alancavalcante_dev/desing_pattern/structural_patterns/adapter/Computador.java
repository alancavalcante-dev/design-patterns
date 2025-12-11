package io.github.alancavalcante_dev.desing_pattern.structural_patterns.adapter;

public class Computador {

    private Cabo hdmi;

    public Computador(Cabo hdmi) {
        this.hdmi = hdmi;
    }

    public void enviarAudioVideo() {
        hdmi.enviarDado();
    }
}

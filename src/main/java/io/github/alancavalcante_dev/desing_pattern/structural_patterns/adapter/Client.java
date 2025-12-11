package io.github.alancavalcante_dev.desing_pattern.structural_patterns.adapter;

public class Client {

    public static void main(String[] args) {

        Computador computador1 = new Computador(new Vga());
        computador1.enviarAudioVideo();

        Computador computador2 = new Computador(new Hdmi());
        computador2.enviarAudioVideo();

        Computador computador3 = new Computador(new AntenaAdapter(new AntenaVelha()));
        computador3.enviarAudioVideo();
    }
}

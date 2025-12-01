package io.github.alancavalcante_dev.desing_pattern.model;

import java.util.Random;

public class Car {

    private Integer rodas = 4;
    private Engine motor;
    private Cors cor;
    private float velocidade;
    private Boolean acelerar;
    private Boolean freiar;

    public Car(Engine motor, Cors cor) {
        this.motor = motor;
        this.cor = cor;
    }

    public void acelerar() {
        if (motor == null){
            throw new RuntimeException("Tem que ter um motor");
        }
        this.setAcelerar();
    }

    public void freiar() {
        this.setFreiar();
    }

    public float velocidade() {
        return this.velocidade;
    }

    private void setAcelerar() {
        velocidade = new Random().nextFloat(1, this.motor.getCilindradas());
    }

    private void setFreiar() {
        velocidade = 0;
    }


}

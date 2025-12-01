package io.github.alancavalcante_dev.desing_pattern;

import io.github.alancavalcante_dev.desing_pattern.factory.MontadoraCarro;
import io.github.alancavalcante_dev.desing_pattern.model.Car;
import io.github.alancavalcante_dev.desing_pattern.model.Cors;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesingPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesingPatternApplication.class, args);


		Car ferrariPuroSangue = MontadoraCarro.montadora("Ferrari", "PUROSANGUE", Cors.VERMELHO);

		ferrariPuroSangue.acelerar();
		System.out.println(ferrariPuroSangue.velocidade());
		ferrariPuroSangue.freiar();
		System.out.println(ferrariPuroSangue.velocidade());
		ferrariPuroSangue.acelerar();
		System.out.println(ferrariPuroSangue.velocidade());

	}



}

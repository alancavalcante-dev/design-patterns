package io.github.alancavalcante_dev.desing_pattern.builder;

import io.github.alancavalcante_dev.desing_pattern.DesingPatternApplication;
import io.github.alancavalcante_dev.desing_pattern.model.Engine;
import org.springframework.boot.SpringApplication;

public class EngineBuilderExec {

    public static void main(String[] args) {
        SpringApplication.run(DesingPatternApplication.class, args);


        Engine motor = Engine.Builder()
                .cilindradas(200)
                .cilindros(4)
                .valvulas(16).build();

        System.out.println(motor);

    }


}

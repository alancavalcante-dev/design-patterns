package io.github.alancavalcante_dev.desing_pattern.creational_patterns.prototype;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        Monstro esqueleto = new Monstro();
        esqueleto.setNome("Esqueleto");
        esqueleto.setHabilidade("Arqueiro");
        esqueleto.setArma(new Arma("Arco", 53));

        Monstro goblin = esqueleto.clone();
        goblin.setNome("Goblin");
        goblin.getArma().setForca(87);

        System.out.println("Esqueleto: " + esqueleto);
        System.out.println("Goblin: " + goblin);

        // output:
        // Esqueleto: Monstro(nome=Esqueleto, habilidade=Arqueiro, arma=Arma(nomeArma=Arco, forca=53))
        // Goblin: Monstro(nome=Goblin, habilidade=Arqueiro, arma=Arma(nomeArma=Arco, forca=87))
    }
}

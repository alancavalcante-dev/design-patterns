package io.github.alancavalcante_dev.desing_pattern.structural_patterns.bridge;

public class Client {
    public static void main(String[] args) {
        Funcionario funcionario = new Gestor(
                "Alan", 22, "alan.cavalcante.dev@gmail.com"
        );

        Converter json = new JsonConverter();
        Converter csv = new CsvConverter();

        System.out.println(json.converterFuncionario(funcionario));
        System.out.println(csv.converterFuncionario(funcionario));

    }
}

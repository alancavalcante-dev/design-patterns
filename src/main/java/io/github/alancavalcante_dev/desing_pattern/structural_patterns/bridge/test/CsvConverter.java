package io.github.alancavalcante_dev.desing_pattern.structural_patterns.bridge.test;

public class CsvConverter implements Converter {

    @Override
    public String converterFuncionario(Funcionario funcionario) {
        return  "\"" + funcionario.getNome() + "\"" + ";" +
                funcionario.getIdade() + ";" +
                "\"" + funcionario.getEmail()  + "\"";
    }

}

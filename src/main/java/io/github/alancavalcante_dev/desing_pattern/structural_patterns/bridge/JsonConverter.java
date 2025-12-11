package io.github.alancavalcante_dev.desing_pattern.structural_patterns.bridge;

public class JsonConverter implements Converter {

    @Override
    public String converterFuncionario(Funcionario funcionario) {
        return  "{" +
                "\"nome\": \"" + funcionario.getNome() + "\", " +
                "\"idade\": " + funcionario.getIdade() + "\", " +
                "\"email\": \"" + funcionario.getEmail() +
                "}";
    }

}

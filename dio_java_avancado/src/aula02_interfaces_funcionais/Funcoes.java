package aula02_interfaces_funcionais;

import java.util.function.Function;

public class Funcoes {

    public static void main(String[] args) {
        Function<String, String> retornarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        System.out.println(retornarNomeAoContrario.apply("Rayrone"));

        Function<String, Integer> converterStringParaInteiro1 = texto -> Integer.valueOf(texto);
        System.out.println(converterStringParaInteiro1.apply("20"));

        // method reference
        Function<String, Integer> converterStringParaInteiro2 = Integer::valueOf;
        System.out.println(converterStringParaInteiro2.apply("40"));

        Function<String, Integer> converterStringParaInteiroECalcularODobro = texto -> Integer.valueOf(texto) * 2;
        System.out.println(converterStringParaInteiroECalcularODobro.apply("60"));
    }
}

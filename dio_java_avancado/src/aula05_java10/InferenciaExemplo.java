package aula05_java10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class InferenciaExemplo {

    public static void main(String[] args) throws IOException {
//        printarNomeCompleto("João", "Santos");
        printarSoma(5, 7);
    }

    private static void connectAndPrintURLJavaOracle() throws IOException {
        var url = new URL("https://docs.oracle.com/javase/10/language");
        var urlConnection = url.openConnection();
        var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

        System.out.println(bufferedReader.lines().collect(Collectors.joining()));
    }

    private static void printarNomeCompleto(String nome, String sobrenome) {
        var nomeCompleto = String.format("%s %s", nome, sobrenome);
        System.out.println(nomeCompleto);
    }

    private static void printarSoma(int a, int b) {
        var soma = a + b;
        System.out.println(soma);
    }

    // É permitido usar inferência de tipos
    // variáveis locais inicializadas
    // variável suporte do enhaced for
    // variável suporte do for iterativo
    // variável try with resource

    // Não é permitido usar inferência de tipos
    // var não pode ser utilizado em nível de classe
    // var não pode ser utilizado como parâmetro
    // var não pode ser utilizado em variáveis locais não inicializadas
}

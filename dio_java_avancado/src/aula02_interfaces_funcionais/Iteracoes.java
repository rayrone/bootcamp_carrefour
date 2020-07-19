package aula02_interfaces_funcionais;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {

    public static void main(String[] args) {
        String[] nomes = {"João", "Paulo", "Oliveira", "Santos", "João"};
        Integer[] numeros = {1, 2, 3, 4, 5};
//        imprimirNomesFiltrados(nomes);
//        imprimirNomesFiltradosComStream(nomes);
//        imprimirNomesFiltrados(nomes);
//        imprimirNomesFiltradosComStream(nomes);
//        imprimirODobroDeCadaItemDaLista(numeros);
//        imprimirODobroDeCadaItemDaListaComStream(numeros);

        List<String> profissoes = Arrays.asList("Desenvolvedor", "Testador",
                "Gerente de Projetos", "DBA", "Gerente de QA");

        profissoes.stream().filter(p -> p.startsWith("Gerente")).forEach(System.out::println);
    }

    public static void imprimirNomesFiltrados(String... nomes) {
        String nomesParaImprimir = "";

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals("João")) {
                nomesParaImprimir += nomes[i] + " ";
            }
        }

        System.out.println(nomesParaImprimir);
    }

    public static void imprimirNomesFiltradosComStream(String... nomes) {
        String nomesParaImprimir = Stream.of(nomes).
                filter(nome -> nome.startsWith("João")).collect(Collectors.joining(" "));
        System.out.println(nomesParaImprimir);
    }

    public static void imprimirTodosOsNomes(String... nomes) {
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

    public static void imprimirTodosOsNomesComStream(String... nomes) {
        // Stream.of(nomes).forEach(nome -> System.out.println(nome));
        Stream.of(nomes).forEach(System.out::println);
    }

    public static void imprimirODobroDeCadaItemDaLista(Integer... numeros) {
        for (Integer numero : numeros) {
            System.out.println(numero * 2);
        }
    }

    public static void imprimirODobroDeCadaItemDaListaComStream(Integer... numeros) {
        //Stream.of(numeros).forEach(n -> System.out.println(n * 2));
        Stream.of(numeros).map(numero -> numero * 2).forEach(System.out::println);
    }
}

package aula02_interfaces_funcionais;

import java.util.function.Consumer;

public class Consumidores {

    public static void main(String[] args) {

        Consumer<String> imprimirUmaFrase = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("Hello World!");

        Consumer<String> imprimirUmaFrase2 = System.out::println;
        imprimirUmaFrase2.accept("Hello World!");
    }
}

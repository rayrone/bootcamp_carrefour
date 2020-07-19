package aula02_interfaces_funcionais;

import java.util.function.Supplier;

public class Supridores {

    public static void main(String[] args) {
        Supplier<Pessoa> supplier1 = () -> new Pessoa();
        System.out.println(supplier1.get());

        Supplier<Pessoa> supplier2 = Pessoa::new;
        System.out.println(supplier2.get());
    }
}

class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa(){
        nome = "Rayrone";
        idade = 32;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, idade: %d", nome, idade);
    }
}

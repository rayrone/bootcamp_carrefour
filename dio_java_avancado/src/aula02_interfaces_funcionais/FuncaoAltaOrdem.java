package aula02_interfaces_funcionais;

@FunctionalInterface
interface Calculo {
    int calcular(int a, int b);
}

public class FuncaoAltaOrdem {

    public static void main(String[] args) {
        Calculo soma = (a, b) -> a + b;
        System.out.println(executarCalculo(soma, 6, 3)); // 9

        Calculo subtracao = (a, b) -> a - b;
        System.out.println(executarCalculo(subtracao, 6, 3)); // 3

        Calculo produto = (a, b) -> a * b;
        System.out.println(executarCalculo(produto, 6, 3)); // 18

        Calculo divisao = (a, b) -> a / b;
        System.out.println(executarCalculo(divisao, 6, 3)); // 2
    }

    public static int executarCalculo(Calculo calculo, int a, int b) {
        return calculo.calcular(a, b);
    }
}
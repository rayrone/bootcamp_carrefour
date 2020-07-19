package aula01_paradigma_funcional;

import java.util.function.BiPredicate;

public class FuncoesPuras {

    public static void main(String[] args) {
        BiPredicate<Integer, Integer> verificaSeEhMaior = (x, y) -> x > y;

        System.out.println(verificaSeEhMaior.test(13, 12));
        System.out.println(verificaSeEhMaior.test(13, 12));
    }
}

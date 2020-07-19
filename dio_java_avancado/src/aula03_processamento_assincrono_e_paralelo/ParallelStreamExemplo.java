package aula03_processamento_assincrono_e_paralelo;

import java.util.stream.IntStream;

public class ParallelStreamExemplo {

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        IntStream.range(1, 10000).forEach(n -> fatorial(n));
        long fim = System.currentTimeMillis();
        System.out.println(fim - inicio);

        // Com parallel stream
        inicio = System.currentTimeMillis();
        IntStream.range(1, 10000).parallel().forEach(n -> fatorial(n));
        fim = System.currentTimeMillis();
        System.out.println(fim - inicio);
    }

    public static long fatorial(long num) {
        long fat = 1;

        for (long i = 2; i <= num; i++)
            fat *= i;

        return fat;
    }
}

package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");



        System.out.println(nomes);

        nomes.set(2, "Luciana");

        System.out.println(nomes);

        Collections.sort(nomes);

        System.out.println(nomes.indexOf("Tatiana"));

        Iterator<String> x = nomes.iterator();

        nomes.remove("Matheus");
    }
}

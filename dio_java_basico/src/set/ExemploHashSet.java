package set;

import java.util.HashSet;

public class ExemploHashSet {

    public static void main(String[] args) {

        HashSet<String> cidades = new HashSet<>();
        cidades.add("Porto Alegre");
        cidades.add("Florianópolis");
        cidades.add("Curitiba");
        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");

        System.out.println(cidades);
    }
}

package set;

import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<String> cidades = new LinkedHashSet<>();
        cidades.add("Porto Alegre");
        cidades.add("Florianópolis");
        cidades.add("Curitiba");
        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");

        System.out.println(cidades);
    }
}

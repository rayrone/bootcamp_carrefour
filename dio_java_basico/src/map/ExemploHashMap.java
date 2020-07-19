package map;

import java.util.HashMap;

public class ExemploHashMap {

    public static void main(String[] args) {

        HashMap<String, String> mapCapitais = new HashMap<>();
        mapCapitais.put("RS", "Porto Alegre");
        mapCapitais.put("PB", "João Pesso");
        mapCapitais.put("TO", "Palmas");
        mapCapitais.put("RJ", "Rio de Janeiro");

        System.out.println(mapCapitais);
    }
}

package list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pâmela");
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll();

        System.out.println(clienteASerAtendido);

        System.out.println(filaBanco);

        clienteASerAtendido = filaBanco.peek();

        System.out.println(clienteASerAtendido);

        System.out.println(filaBanco);

        clienteASerAtendido = filaBanco.element();

        System.out.println(clienteASerAtendido);

        System.out.println(filaBanco);

        filaBanco.clear();

        System.out.println(filaBanco.poll());
//
//        clienteASerAtendido = filaBanco.element();



    }

}

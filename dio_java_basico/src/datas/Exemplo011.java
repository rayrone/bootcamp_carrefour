import javafx.application.Application;
import javafx.stage.Stage;

import java.time.LocalDate;

public class Exemplo011 {

    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalDate ontem = hoje.minusDays(1);

        System.out.println("Hoje é: " + hoje);
        System.out.println("Ontem foi: " + ontem);
    }
}

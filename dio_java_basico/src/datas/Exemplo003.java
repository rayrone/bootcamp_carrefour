import java.util.Date;

public class Exemplo003 {

    public static void main(String[] args) {

        Date dataNoPassado = new Date(1513124807691L);
        System.out.println(dataNoPassado);

        Date dataNoFuturo = new Date(1613124807691L);
        System.out.println(dataNoFuturo);

        System.out.println();

        boolean isAfter = dataNoPassado.after(dataNoFuturo);
        System.out.println(isAfter);

        boolean isBefore = dataNoPassado.before(dataNoFuturo);
        System.out.println(isBefore);
    }
}

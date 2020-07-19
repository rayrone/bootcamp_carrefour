package OCP.solucao;

public class DescontoLivroInfantil implements  DescontoLivro {

    @Override
    public double valorDesconto() {
        return 0.5;
    }

}

package aula01_paradigma_funcional;

public class FuncaoComLambda {

    public static void main(String[] args) {
        Funcao colocarPrefixoSenhorNaString2 = valor -> "Sr. " + valor;
        System.out.println(colocarPrefixoSenhorNaString2.gerar("João"));
    }
}

package aula06_java11;

public class StringIsBlankExemplo {
    public static void main(String[] args) {
        String espaco = "                                     ";
        // Verificar string vazia antes do java 11
        System.out.println(espaco.length() == 0 || espaco.chars().allMatch(c -> c == ' '));
        // Verificar string vazia a partir do java 11
        System.out.println(espaco.isBlank());
    }
}

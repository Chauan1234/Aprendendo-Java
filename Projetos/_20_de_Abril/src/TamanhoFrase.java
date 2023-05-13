import java.util.Scanner;

public class TamanhoFrase {
    public static void main(String[] args) {
        String frase;
        int tamanho;

        Scanner s = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        frase = s.nextLine();

        tamanho = frase.length();
        System.out.print(tamanho + " caracteres");
    }
}

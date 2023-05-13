import java.util.Scanner;

/**
 * Neste exemplo pedimos para o usuário digitar a idade,
 * depois imprimimos uma frase com a idade lida.
 */
public class Usuario_digita {
    public static void main(String[] args) {
        int idade;
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        idade = s.nextInt();
        System.out.println("Você tem " + idade + " anos.");
    }
}
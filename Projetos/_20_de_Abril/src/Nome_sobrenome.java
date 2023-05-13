/*
1. Faça um algoritmo que:
a) Leia o nome;
b) Leia o sobrenome;
c) Concatene o nome com o sobrenome;
d) Apresente o nome completo.
 */
import java.util.Scanner;

public class Nome_sobrenome {
   private String eai;
    public void nomes(){
        String nome, sobrenome;
        Scanner s = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = s.nextLine();

        System.out.println("Digite seu sobrenome: ");
        sobrenome = s.nextLine();

        System.out.println("Seu nome: " + nome + " " + sobrenome);
    }
}

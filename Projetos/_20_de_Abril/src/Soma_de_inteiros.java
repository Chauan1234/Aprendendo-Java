/*
2.Faça um algoritmo que:
a) Leia um número inteiro;
b) Leia um segundo número inteiro;
c) Efetue a adição dos dois valores;
d) Apresente o valor calculado
 */
import java.util.Scanner;

public class Soma_de_inteiros {
    public static void main(String[] args){
        int num1, num2, soma;
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        num1 = s.nextInt();
        System.out.println("Digite um numero: ");
        num2 = s.nextInt();

        soma = num1 + num2;

        System.out.println("A soma dos valores fica: " + soma);
    }
}

import java.util.Scanner;

/*
2- Faça um programa que peça um valor e mostre na tela se o valor é
positivo ou negativo.
 */
public class Valor_positivo_ou_negativo {
    public static void main(String[] args) {
        double num;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num = s.nextDouble();

        if (num >= 0){
            System.out.println(num + " é positivo");
        } else {
            System.out.println(num + " é negativo");
        }
    }
}

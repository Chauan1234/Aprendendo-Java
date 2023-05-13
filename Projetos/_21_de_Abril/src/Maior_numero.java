import java.util.Scanner;

/*
1- Faça um programa que peça dois números e verifique e imprima
o maior deles.
 */
public class Maior_numero {
    public static void main(String[] args) {
        double num, maior = 0.0;
        Scanner s = new Scanner(System.in);

        for(int i = 1; i <= 2; i++){
            System.out.println("Digite um número: ");
            num = s.nextDouble();

            if(num >= maior){
                maior = num;
            }
        }
        System.out.println(maior + " foi o maior número digitado");
    }
}

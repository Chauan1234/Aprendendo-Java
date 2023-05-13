import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        double num1=0, num2=0, num3=0;
        boolean passou = false;
        Scanner s = new Scanner(System.in);
        while(!passou) {
            try {
                System.out.println("Digite um número: ");
                num1 = s.nextDouble();

                System.out.println("Digite um número: ");
                num2 = s.nextDouble();

                System.out.println("Digite um número: ");
                num3 = s.nextDouble();
                passou = true;
            }catch (InputMismatchException exception){
                System.out.println("Deixa de ser burro, só pode número");
                s.next();
            }
        }

            if (num1 > num2 && num1 > num3) {
                System.out.println(num1 + " é o maior valor");
            } else if (num2 > num3) {
                System.out.println(num2 + " é o maior valor");
            } else if (num3 > num2) {
                System.out.println(num3 + " é o maior valor");
            } else {
                System.out.println("Todos os valores são iguais");
            }

    }
}

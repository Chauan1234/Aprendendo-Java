import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        String nome;
        double salario=0, aumento;
        Scanner s = new Scanner(System.in);
        boolean passou = false;

        System.out.println("Digite seu nome: ");
        nome = s.nextLine();

        while(!passou) {
            try {
                System.out.println("Digite seu salário: ");
                salario = s.nextDouble();
                if (salario > 0) {
                    passou = true;
                } else {
                    System.out.println("salario negativo nao da escravidao");
                }
            } catch (InputMismatchException exception) {
                System.out.println("Apenas são permitidos números");
                s.next();
            }
        }
        if(salario <= 2000){
            aumento = salario + (salario * 0.05);
        } else if (salario <= 3500) {
            aumento = salario + (salario * 0.04);
        } else {
            aumento = salario + (salario * 0.03);
        }
        System.out.println(nome + " seu salário era: " + salario + " seu novo salário é: " + aumento);
    }
}

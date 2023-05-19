import java.util.Scanner;

public class ProvaVetor {
    public static void main(String[] args) {
        String[] nomeFunc = new String[999]; String nomeMaiorSalario = "";
        double[]  somasalarios = new double[4], salario = new double[999]; double maior = 0.0, aumentosalario = 0.0;
        char[] sexo = new char[999]; char continua = 's', categFunc;
        int i = 1;

        while(continua != 'N'){
            Scanner s = new Scanner(System.in);
            System.out.print("Digite nome do funcionário: "); nomeFunc[i] = s.nextLine();

            System.out.print("Digite salário funcionário: "); salario[i] = s.nextDouble();
            somasalarios[0] += salario[i];

            System.out.print("Digite sexo do funcionário: "); sexo[i] = s.next().toUpperCase().charAt(0);

            System.out.print("Digite categoria do funcionário: "); categFunc = s.next().toUpperCase().charAt(0);

            if (categFunc == 'A') {
                aumentosalario = salario[i] + (salario[i] * 3) / 100;
                somasalarios[1] += aumentosalario;
            } else if (categFunc == 'B') {
                aumentosalario = salario[i] + (salario[i] * 4) / 100;
                somasalarios[1] += aumentosalario;
            } else if (categFunc == 'C') {
                aumentosalario = salario[i] + (salario[i] * 5) / 100;
                somasalarios[1] += aumentosalario;
            }
            if (sexo[i] == 'M') {
                somasalarios[2] += aumentosalario;
            } else if (sexo[i] == 'F') {
                somasalarios[3] += aumentosalario;
            }
            if (aumentosalario >= maior) {
                maior = aumentosalario;
                nomeMaiorSalario = nomeFunc[i];
            }
            i++;
            System.out.print("Deseja continuar(S/N)? "); continua = s.next().toUpperCase().charAt(0);
        }
        System.out.println("Soma de todos os salários sem aumento: " + somasalarios[0]);
        System.out.println("Soma de todos os salários com aumento: " + somasalarios[1]);
        System.out.println("Soma dos salários aumentados sexo Masculino: " + somasalarios[2]);
        System.out.println("Soma dos salários aumentados sexo Feminino: " + somasalarios[3]);
        System.out.println(nomeMaiorSalario + " salário com aumento: " + maior);
    }
}
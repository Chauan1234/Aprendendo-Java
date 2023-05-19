import java.util.Scanner;
    public class VetorEduardo {
    public static void main(String[] args) {
        double salarioFuncionario[] = new double[100];
        char variavel [] = new char[100];
        while(variavel[0]!='N') {
            Scanner s = new Scanner(System.in);
            System.out.println("Digite nome do funcionario: ");
            variavel[2] = s.next().charAt(0);
            System.out.println("Digite salario do funcionario: ");
            salarioFuncionario[1] = s.nextDouble();
            System.out.println("Digite sexo do funcionario: ");
            variavel[3] = s.next().charAt(0);
            System.out.println("Digite categoria: ");
            variavel[10] = s.next().charAt(0);
           salarioFuncionario[9] = salarioFuncionario[9] + salarioFuncionario[1];
            if ( variavel[10] == 'A') {
                salarioFuncionario[30] = salarioFuncionario[1] + (salarioFuncionario[1] * 3) / 100;
            }if (  variavel[10]== 'B') {
                salarioFuncionario[30]  = salarioFuncionario[1] + (salarioFuncionario[1] * 4) / 100;
            } if ( variavel[10] == 'C') {
                salarioFuncionario[30] = salarioFuncionario[1] + (salarioFuncionario[1] * 5) / 100;
            }salarioFuncionario[20] = salarioFuncionario[20] + salarioFuncionario[30];
            if ( variavel[3] == 'M'){
                salarioFuncionario[11] = salarioFuncionario[11] + salarioFuncionario[30];
            }   if ( variavel[3]== 'F'){
               salarioFuncionario[10] = salarioFuncionario[10] + salarioFuncionario[30];
            }if(salarioFuncionario[30] > salarioFuncionario[40]){
            salarioFuncionario[40] = salarioFuncionario[30];  variavel[20] =  variavel[2];
            }System.out.println("Quer continuar: ");
           variavel[0] = s.next().charAt(0);}
        System.out.println("Soma de todas os salarios sem aumento: " + salarioFuncionario[9]);
        System.out.println("Soma de todas os salarios com aumento: " +salarioFuncionario[20]);
        System.out.println("Soma dos salarios aumentados sexo Masculino: " + salarioFuncionario[11]);
        System.out.println("Soma dos salarios aumentados sexo Feminino: " +salarioFuncionario[10]);
        System.out.println( variavel[20] + " salario com aumento: " + salarioFuncionario[40]);}}
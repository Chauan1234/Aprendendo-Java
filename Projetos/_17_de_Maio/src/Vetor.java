import java.util.Scanner;

/*
O programa deverá perguntar a quantidade de pessoas, após isso irá colocar a idade e altura de cada pessoa, o programa
então vai calcular a médias das alturas, por fim será mostrado a quantidade de pessoas com a altura MENOR que a média e
que tenha 13 anos ou mais.
 */
public class Vetor {
    public static void main (String[] args) {
        int i, idade[] = new int[6],quant=0,quantPessoa;
        double altura[] = new double[6],media=0.0;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a quantidade de pessoas: ");
        quantPessoa = s.nextInt();
        for(i = 1; i <= quantPessoa ; i++) {
            System.out.print("Digite idade: ");
            idade[i] = s.nextInt();
            System.out.print("Digite altura: ");
            altura[i] = s.nextDouble();
            media += altura[i];
        }
        media /= 5;
        for(i = 1; i <= 5; i++) {
            if (idade[i] >= 13 && altura[i] < media) {
                quant += 1;
            }
        }



        System.out.println(quant);

    }
}

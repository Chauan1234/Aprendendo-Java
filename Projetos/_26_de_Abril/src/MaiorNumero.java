import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        double num, maior = 0;
        int quant_num;
        Scanner s = new Scanner(System.in);

        System.out.print("Digite quantidade de números: ");
        quant_num = s.nextInt();

        for (int i = 1; i <= quant_num; i++){
            System.out.print("Digite número " + i + ": ");
            num = s.nextDouble();

            if (num >= maior){
                maior = num;
            }
        }
        System.out.println(maior);
    }
}

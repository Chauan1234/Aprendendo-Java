import java.util.Scanner;
/*
4- Faça um programa que pergunte o preço de três produtos e informe
qual produto você deve comprar, sabendo que a decisão é sempre o
mais barato.
 */
public class ProdutoMaisBarato {
    public static void main(String[] args) {
        double preco, menor = 99999.9;
        int guarde_i = 0;
        Scanner s = new Scanner(System.in);

        for (int i = 1; i <= 3; i++){
            System.out.print("Digite preço do produto " + i + ": ");
            preco = s.nextDouble();

            if (preco <= menor){
                guarde_i = i;
                menor = preco;
            }
        }
        System.out.print(guarde_i + " é o produto mais barato com o preço de: R$" + menor);
    }
}

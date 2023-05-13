import java.util.Scanner;

public class ProvaBrincadeira {
    public static void main(String[] args) {
        double categA, categB, categC, precoMedicamento, precodesconto = 0.0, totalsemdesconto = 0.0, totalcomdesconto = 0.0, totalvendascategB = 0.0;
        double percendescon, maiorPreco = 0.0, menorPreco = 99999.9;
        int quantVendida, quantVendidosemdesconto = 0, quantVendidocomdesconto = 0;
        String nomeMedicamento, menorprecoMedicamento = "", maiorprecoMedicamento = "";
        char continua = 'S', categoriaMedicamento;
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o valor do desconto da categoria A: ");
        categA = s.nextDouble();
        categB = categA + 1;
        categC = categA + 2;

        while (continua != 'N'){
            System.out.print("\nDigite o nome do medicamento: ");
            nomeMedicamento = s.next();

            System.out.print("Digite preço do medicamento: ");
            precoMedicamento = s.nextDouble();

            System.out.print("Digite a quantidade vendida: ");
            quantVendida = s.nextInt();
            totalsemdesconto += precoMedicamento * quantVendida;

            System.out.print("Digite a categoria do medicamento: ");
            categoriaMedicamento = s.next().charAt(0);

            if (categoriaMedicamento == 'A'){
                quantVendidocomdesconto += quantVendida;
                precodesconto = precoMedicamento - (precoMedicamento * categA) / 100;
                totalcomdesconto += precodesconto * quantVendida;
                System.out.print("Medicamento com desconto de " + categA + " R$" + precodesconto);
            }
            else if (categoriaMedicamento == 'B') {
                quantVendidocomdesconto += quantVendida;
                precodesconto = precoMedicamento - (precoMedicamento * categB) / 100;
                totalcomdesconto += precodesconto * quantVendida;
                totalvendascategB += precodesconto * quantVendida;
                System.out.print("Medicamento com desconto de " + categB + " R$" + precodesconto);
            }
            else if (categoriaMedicamento == 'C') {
                quantVendidocomdesconto += quantVendida;
                precodesconto = precoMedicamento - (precoMedicamento * categC) / 100;
                totalcomdesconto += precodesconto * quantVendida;
                System.out.print("Medicamento com desconto de " + categC + " R$" + precodesconto);
            } else {
                quantVendidosemdesconto += quantVendida;
                totalcomdesconto += precoMedicamento * quantVendida;
                System.out.print("Medicamento sem desconto: " + precoMedicamento);
            }
            if (precodesconto >= maiorPreco){
                maiorPreco = precodesconto;
                maiorprecoMedicamento = nomeMedicamento;
            }
            if (precodesconto <= menorPreco){
                menorPreco = precodesconto;
                menorprecoMedicamento = nomeMedicamento;
            }

            System.out.print("\nDeseja continuar(S/N)? ");
            continua = s.next().charAt(0);
        }
        percendescon = ((totalsemdesconto - totalcomdesconto) / totalsemdesconto) * 100;
        System.out.print("\nTotal geral sem desconto: " + totalsemdesconto);
        System.out.print("\nTotal geral com desconto: " + totalcomdesconto);
        System.out.print("\nPorcentagem do desconto dado: " + percendescon);
        System.out.print("\n" + menorprecoMedicamento + " é o produto com menor preço: R$" + menorPreco);
        System.out.print("\n" + maiorprecoMedicamento + " é o produto com maior preço: R$" + maiorPreco);
        System.out.print("\nO total das vendas da categoria B foi: " + totalvendascategB);
        System.out.print("\nMedicamentos vendidos sem desconto: " + quantVendidosemdesconto);
        System.out.print("\nMedicamentos vendidos com desconto: " + quantVendidocomdesconto);
    }
}
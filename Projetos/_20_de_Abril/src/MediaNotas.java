import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, continua = "";
        int quant_Notas;
        double somaNotas = 0, nota, media;

        while(!continua.equalsIgnoreCase("N")) {
            System.out.print("Digite o nome do aluno(a): ");
            nome = input.nextLine();

            System.out.print("Digite a quantidade de notas: ");
            quant_Notas = input.nextInt();

            for(int i = 1; i <= quant_Notas; i++) {
                System.out.print("Digite a nota " + i + ": ");
                nota = input.nextDouble();
                somaNotas += nota;
            }
            media = somaNotas / quant_Notas;
            System.out.println("Média: " + media);

            if(media >= 7) {
                System.out.println(nome + " está acima da média.");
            } else if(media >= 6) {
                System.out.println(nome + " está na média.");
            } else if(media >= 4) {
                System.out.println(nome + " está em recuperação.");
            } else {
                System.out.println(nome + " está reprovado.");
            }

            input.nextLine(); // consome o \n deixado pelo nextDouble()
            System.out.print("Deseja continuar (S/N)? ");
            continua = input.nextLine();
        }
        input.close();
    }
}
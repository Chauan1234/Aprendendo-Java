import java.util.InputMismatchException;
import java.util.Scanner;

public class MediaAluno_V2 {
    public static void main(String[] args) {
        String nome;
        double nota, media = 0;
        int quant_notas;
        boolean passou = true;
        Scanner s = new Scanner(System.in);

        System.out.print("Digite nome aluno: ");
        nome = s.nextLine();

        while(passou){
            try{
                System.out.print("Digite quantidade de notas: ");
                quant_notas = s.nextInt();

                for (int i = 1; i <= quant_notas; i++){
                    passou = false;
                    while(!passou){
                        System.out.print("Digite nota " + i + ": ");
                        nota = s.nextDouble();

                        if (nota < 0 || nota > 10){
                            System.out.println("Não é aceito valores abaixo de 0 ou acima de 10");
                        } else {
                            passou = true;
                            media += nota;
                        }
                    }
                }
                media /= quant_notas;
                System.out.println("Média do filho de uma puta " + nome + ": " + media);

            }catch (InputMismatchException exception){
                System.out.println("Apenas são permitidos números");
                s.next();
            }
        }
    }
}
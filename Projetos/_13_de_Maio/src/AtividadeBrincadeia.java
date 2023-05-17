import java.util.Scanner;

public class AtividadeBrincadeia {
    public static void main(String[] args) {
        String nomeEscola, nomeAluno;
        int quantEscolas, quantAlunos, quantNotas;
        double nota, maiorMediaAluno = 0.0, menorMediaAluno = 9999.9, mediaEscola, mediaAluno = 0.0;

        Scanner s = new Scanner(System.in);
        System.out.print("Quantidade de escolas"); quantEscolas = s.nextInt();

        for(int infoEscola = 1; infoEscola <= quantEscolas; infoEscola++){
            Scanner ler = new Scanner(System.in);
            System.out.print("Nome da Escola: "); nomeEscola = ler.nextLine();

            System.out.print("Quantidade de alunos: ");quantAlunos = s.nextInt();

            System.out.print("Quantidade de notas: "); quantNotas = s.nextInt();

            for(int infoAlunos = 1; infoAlunos <= quantAlunos; infoAlunos++){
                Scanner input = new Scanner(System.in);
                System.out.print("Nome aluno: "); nomeAluno = input.nextLine();

                System.out.print("Digite nota " + infoAlunos + ": "); nota = input.nextDouble();

                mediaAluno += nota;
            }
            mediaAluno /= quantNotas;
            System.out.print("Média do aluno: " + mediaAluno);
        }
    }
}

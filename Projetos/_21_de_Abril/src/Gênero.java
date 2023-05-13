import java.util.Scanner;

/*
3- Faça um programa que verifique se uma letra digitada é “F” ou
“M”. Conforme a letra escrever: F – Feminino, M- Masculino, caso não
seja nenhuma das duas escreva a mensagem “Sexo inválido”.
 */
public class Gênero {
    public static void main(String[] args) {
        char sexo;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu gênero(M/F): ");
        sexo = s.next().charAt(0);

        if (sexo == 'M'){
            System.out.println("Masculino");
        } else if (sexo == 'F') {
            System.out.println("Feminino");
        } else {
            System.out.println("Sexo inválido");
        }
    }
}

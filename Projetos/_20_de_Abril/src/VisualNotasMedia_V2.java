import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VisualNotasMedia_V2 {
    public static void main(String[] args) {
        String nome, aux, aux2;
        double nota, media = 0, quant_notas = 0;
        int i;
        boolean passou = false;
        Scanner s = new Scanner(System.in);

        nome = JOptionPane.showInputDialog(null, "Digite nome aluno: ");

        while (!passou) {
            try {
                aux = JOptionPane.showInputDialog(null, "Digite quantidade de notas: ");
                quant_notas = Double.parseDouble(aux);

                for (i = 1; i <= quant_notas; i++) {
                    aux2 = JOptionPane.showInputDialog(null, "Digite nota " + i + ": ");
                    nota = Double.parseDouble(aux2);

                    if (nota >= 10) {
                        passou = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Apenas são permitidos valores iguais ou abaixo de 10");
                    }
                    media += nota;
                }
            } catch (InputMismatchException exception) {
                JOptionPane.showMessageDialog(null, "Apenas são permitidos números");
                s.next();
            }
            media /= quant_notas;
            if (media >= 7) {
                JOptionPane.showMessageDialog(null, media + " Acima da média");
            } else if (media >= 6) {
                JOptionPane.showMessageDialog(null, media + " Na média");
            } else if (media >= 4) {
                JOptionPane.showMessageDialog(null, media + " Recuperação");
            } else {
                JOptionPane.showMessageDialog(null, media + " Reprovado");
            }
        }
    }
}
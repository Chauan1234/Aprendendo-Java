import javax.swing.*;

public class Visual_notas_media {
    public static void main(String[] args) {
        double nota1, nota2, nota3, media;
        String nome, aux, resul;
        nome = JOptionPane.showInputDialog(null, "Digite nome do aluno: ");
        aux = JOptionPane.showInputDialog(null, "Digite nota 01: ");
        nota1 = Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog(null, "Digite nota 02: ");
        nota2 = Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog(null, "Digite nota 03: ");
        nota3 = Double.parseDouble(aux);

        media = (nota1 + nota2 + nota3) / 3;

        if (media > 6){
            resul = "acima da média!";
        } else if (media >= 6) {
            resul = "na média!";
        } else if (media >= 4) {
            resul = "em recuperação!";
        } else {
            resul = "reprovado!";
        }
        JOptionPane.showMessageDialog(null, nome + " sua média foi: " + media + " você está: " + resul);
    }
}
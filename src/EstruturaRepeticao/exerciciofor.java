package EstruturaRepeticao;

import javax.swing.*;

public class exerciciofor {

    public static void main(String[] args) {
        String aluno;
        // sempre antes de executar varias variaveis, eu tenho que declaralas antes e se possivel atribuir alguns valores a elas.

        float nota1, nota2, media, somaMedias, mediaTurma;

        somaMedias = 0;

        for(int contador = 1; contador <= 3; contador++) {

            aluno = JOptionPane.showInputDialog("Nome do aluno: ");
            nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: "));
            nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: "));

            media = (nota1 + nota2) / 2;
            somaMedias = somaMedias + media;

            System.out.println("Aluno: " + aluno);
            System.out.println("Média: " + media);

            if (media >= 6) {
                System.out.println("Aluno Aprovado(a)");
            } else {
                System.out.println("Reprovado!");
            }

        }
    mediaTurma = somaMedias / 3;
        System.out.println("\nMedia da turma: " + mediaTurma);
    }



}

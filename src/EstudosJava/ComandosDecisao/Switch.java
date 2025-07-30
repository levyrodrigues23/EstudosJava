package EstudosJava.ComandosDecisao;

import javax.swing.*;

public class Switch {
    public static void main(String[] args) {

        String fruta;
        fruta = JOptionPane.showInputDialog("Digite o nome de uma fruta: ");
        // ele meio que avalia o valor de uma variavel e dependendo
        // do resultado ele entra dentro de um resultado e executa a ação
        switch (fruta){
            case "Banana":
                System.out.println("voce digitou banana!");
                break;
            case "Laranja":
                System.out.println("voce digitou Laranja!");
                break;
            case "Uva":
                System.out.println("voce digitou Uva!");
                break;

                // o default tem mais relação em questão de não cobrir os casos acima
            default:
                System.out.println("voce não digitou uma fruta valida");
                break;
        }
    }
}

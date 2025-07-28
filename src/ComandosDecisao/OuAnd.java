package ComandosDecisao;

import javax.swing.*;

public class OuAnd {
    public static void main(String[] args) {

        String fruta;
        fruta = JOptionPane.showInputDialog("Digite o nome da fruta: ");
        if(fruta.equals("Maça") || fruta.equals("Banana")){
            JOptionPane.showMessageDialog(null, "A fruta é " + fruta);

        }else{
            JOptionPane.showMessageDialog(null, "A fruta é meio que invalida");
        }
    }
}

package ComandosDecisao;

public class Funcao_IF {
    public static void main(String[] args){
        int numero = 10;
        String nome = "Ana";


        if(numero >= 10){
            System.out.println("o número é maior do que 10");
        }


        if(nome.equals("Ana")){
            System.out.println("o nome é " + nome);
        }else {
            System.out.println("sinto muito mas este nome é meio invalido");
        }
    }
}

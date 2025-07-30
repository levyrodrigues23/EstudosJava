package EstudosJava.exercicios;

public class imparoupar {
    public static void main(String[] args) {
        java.util.Scanner objetoNumero = new java.util.Scanner(System.in);
        System.out.println("Digite um número e eu direi se ele é impar ou par: ");
        int numero = objetoNumero.nextInt();
        if(numero % 2 == 0){
            System.out.println("o numero "  + numero + " é par");
        }else {
            System.out.println("o número " + numero + "é impar");
        }

    }
}

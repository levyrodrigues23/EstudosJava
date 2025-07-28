package exercicios;

public class diferençanumeros {
    public static void main(String[] args){
        java.util.Scanner objetoNumero = new java.util.Scanner(System.in);
        System.out.println("Digite um primeiro número");
        float numero1 = objetoNumero.nextFloat();
        System.out.println("Digite um segundo número");
        float numero2 = objetoNumero.nextFloat();
        float diferença = (numero1 - numero2);
        System.out.println("A diferença entre os dois numeros equivale a: " + diferença);
    }
}

package EstudosJava;


public class Scanner {
    public static void main(String[] args) {
        java.util.Scanner objNome = new java.util.Scanner(System.in);
        System.out.println("Digite seu nome: ");
        // basicamente o que estava armazenado foi printado, o uso do scanner para poder utilizar de print
        String nome = objNome.nextLine();
       // System.out.println("Nome digitado: " + nome);

        System.out.print("digite sua idade: ");

        int idade = objNome.nextInt();
        System.out.print("idade de " + nome + " equivale a " + idade);

        /*
        nextLine meio que armazena textos

         */
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int numeroInteiro = scanner.nextInt();
        byte numeroByte = scanner.nextByte();
        long numeroLong = scanner.nextLong();
        boolean numeroBoleano = scanner.nextBoolean();
        float numeroFloat = scanner.nextFloat();
        double numeroDouble = scanner.nextDouble();
    }
}

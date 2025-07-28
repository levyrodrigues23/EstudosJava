package EstudosJava;

public class ImpressaoTexto {

    public static void main(String[] args) {

// \n é caracterizado como um caracter de escape
        System.out.print("olá mundo\n");
        System.out.println("texto simples");
        // usando o ln, ele posiciona o cursor da linha de baixo
        System.out.println("texto simples2");

        // %s aqui é para ser uma string
         //%d aqui é um valor inteiro
         //%f aqui é um valor float
         //%b aqui é boleano
        // %n no printf indica diretamente uma quebra de linha
        System.out.printf("%n%n - Nome: %s - idade: %d","texto simples 2\n", 25);

        //variavel para armazenamento temporario
        // espaço de alocação na memoria
        int numero1 = 5;
        int numero2 = 10;
        System.out.printf("\n\nSoma dos números: %d", (numero1 + numero2));

    }
}

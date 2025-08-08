public class while_calculadora {
    public static void main(String[] args) {
        double soma = 0;
        int contador = 0;

        while(contador < 35){
            int precoLivro =  30;
            soma = soma + precoLivro;
            contador = contador + 1;

        }
        System.out.println("O valor total é: " + soma);
        if(soma < 500){
            System.out.println("O valor é menor que 500");
        } else {
            System.out.println("O valor é maior ou igual a 500");
        }
    }
}

// lidando com looping infinito
// trabalhando com continue e break
// é notorio perceber que o continue e o break são usados para controlar o fluxo de execução dentro de loops. O continue pula a iteração atual e continua com a próxima, enquanto o break encerra completamente o loop. Esses comandos são úteis para otimizar a lógica do programa e evitar iterações desnecessárias.

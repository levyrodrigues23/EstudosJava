public class calculadoradeestoque {
public static void main(String[] args) {
    double livroJava8 = 56.87; // quantidade de livros Java 8
    double livroTDD  = (int) 59.76; // esse é um pequeno exemplo de casting, ou seja, estou convertendo o double para int, mas isso pode levar a perda de precisão. o valor será arredondado para baixo, então 59.76 se torna 59.
    
    double soma = livroJava8 + livroTDD; // soma dos preços dos livros
    System.out.println("A soma dos preços dos livros é: " + soma);


}
}
//existem alguns tipos primitivos no Java, como int, double, boolean, char, . Esses tipos são usados para armazenar valores simples e são fundamentais para a programação em Java.

//temos algo que nos chamamos de casting, ou seja, eu posso converter tipos mas perco um pouco de precisão.

// tbm aprendi sobre o uso do operador ternario, que é basicamente uma forma simplificada de códiigo    que faz a mesma merda que um if, mas com menos linhas de código.
package EstudosJava.ComandosDecisao;

import java.util.Scanner;

public class FuncaoIfElseIfAndElse {
    public static void main(String[] args){

//        Scanner objetoIdade = new Scanner(System.in);
//        int idade;
//
//        System.out.println("digite sua idade: ");
//        // le e retorna um numero inteiro
//        idade = objetoIdade.nextInt();
//
//        if(idade >= 18){
//            System.out.println("Maior de idade");
//        } else{
//            System.out.println("menor de idade");
//        }

        Scanner objetoNota = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, media;
        System.out.println("digite a nota 1: ");
        nota1 = objetoNota.nextDouble();
        System.out.println("digite a nota 2: ");
        nota2 = objetoNota.nextDouble();
        System.out.println("digite a nota 3: ");
        nota3 = objetoNota.nextDouble();
        System.out.println("digite a nota 4: ");
        nota4 = objetoNota.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        if(media >= 7){
            System.out.println("Media: " + media + " - Situação: Aprovado(a)");
        } else if(media >= 2){
            System.out.println("Média: " + media + " - Situação: Recuperação");
        } else {
            System.out.println("Média" + media + " - Situação: Reprovado");
        }


    }
}

package Brincadeiras;
import java.util.Scanner;
import java.util.Random;

public class escolhas {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            boolean tentativa = true;

            System.out.println("Bem-vindo a este pequeno jogo com esta pequena história!");
            System.out.println("Eu espero que você goste. Boa sorte nas escolhas, amigo!\n");

            System.out.println("É um belo dia na cidadezinha... ops, eu acho que não tem ninguém em casa e o dia está chuvoso lá fora.");
            System.out.println("Talvez eu coma alguma coisa... O que exatamente?");
            System.out.println("Selecione uma opção:");
            System.out.println("(a) Tomar uma coca geladinha e assistir Dexter");
            System.out.println("(b) Procurar se realmente não tem ninguém em casa");

            String primeira = entrada.nextLine();

            while (!primeira.equalsIgnoreCase("a") && !primeira.equalsIgnoreCase("b")) {
                System.out.println("Opção inválida! Tente novamente (a ou b):");
                primeira = entrada.nextLine();
            }

            if (primeira.equalsIgnoreCase("a")) {
                System.out.println("Boa opção! Eu fui na geladeira, peguei aquela coca geladinha...");
                System.out.println("Mas quando fui assistir Dexter... NÃO TEM INTERNET! 😭");

                System.out.println("O que você quer fazer?");
                System.out.println("(a) Desligar e ligar o roteador");
                System.out.println("(b) Ligar a cobrar para alguém pedindo ajuda");

                String segunda = entrada.nextLine();

                while (!segunda.equalsIgnoreCase("a") && !segunda.equalsIgnoreCase("b")) {
                    System.out.println("Opção inválida! Tente novamente (a ou b):");
                    segunda = entrada.nextLine();
                }

                if (segunda.equalsIgnoreCase("a")) {
                    System.out.println("Você foi até o roteador, desligou... esperou... ligou de novo.");
                    Random random = new Random();
                    boolean internetVoltou = random.nextBoolean();

                    if (internetVoltou) {
                        System.out.println("A internet voltou! 🎉 Você assistiu Dexter com sua coca e teve um dia perfeito.");
                        System.out.println("Parabéns, você ganhou +100 de aura nostálgica!");
                    } else {
                        System.out.println("Nada mudou. A luz do roteador continua piscando vermelho. 😓");
                        System.out.println("Você tentou mais uma vez e... o roteador explodiu. Fim trágico.");
                    }

                } else if (segunda.equalsIgnoreCase("b")) {
                    System.out.println("Você ligou para seu amigo Pedro, mas ele atendeu gritando:");
                    System.out.println("\"MANO, EU TÔ JOGANDO RANKED, NÃO ME LIGA A COBRAR!\"");
                    System.out.println("Fim da ligação. Você refletiu sobre suas amizades. Fim melancólico, porém reflexivo.");
                }

            } else if (primeira.equalsIgnoreCase("b")) {
                System.out.println("Você decidiu investigar e viu um homem arrumando o poste da rua...");
                System.out.println("Era o técnico da internet! 😱");
                System.out.println("Você olhou pro celular e viu uma mensagem da sua mãe:");
                System.out.println("\"FICA DE OLHO NO TÉCNICO!\"");

                System.out.println("Você ficou vermelho de vergonha por ter esquecido.");
                System.out.println("Fim rápido. Você perdeu -20 de aura por vacilo familiar.");
            }

            entrada.close();
            System.out.println("\nObrigado por jogar! Digite novamente para jogar de novo.");
        }
    }



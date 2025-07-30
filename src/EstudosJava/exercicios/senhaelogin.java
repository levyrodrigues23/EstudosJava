package EstudosJava.exercicios;

public class senhaelogin {
    public static void main(String[] args) {
        java.util.Scanner objetoNome = new java.util.Scanner(System.in);
        java.util.Scanner objetoSenha = new java.util.Scanner(System.in);

        System.out.println("digite o seu nome: ");
        String nome = objetoNome.nextLine();
        System.out.println("digite a sua senha: ");
        int senha = objetoSenha.nextInt();
        if(nome.equals("Roger") && senha == 123){
            System.out.println("querido " + nome + ", voce foi logado com sucesso!" );
        }else {
            System.out.println("tem parada ai mermao, o morro ta muito tranquilo...");
        }
    }
}

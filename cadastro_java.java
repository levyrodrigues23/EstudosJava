public class cadastro_java {
    public static void main(String[] args) {
        System.out.println("🚀 SISTEMA DE CADASTRO DE LIVROS 🚀");
        System.out.println("===================================\n");
        
        // Criando um autor
        Autor autor = new Autor();
        autor.nome = "José";
        autor.email = "teste@gmail.com";
        autor.cpf = "123456789-00";

        // Criando um livro
        Livro livro = new Livro();
        livro.nome = "Java POO";
        livro.descricao = "Livro de Java POO";
        livro.valor = 59.90;
        livro.isbn = "123-456-789";
        livro.autor = autor;

        // Exibindo as informações
        System.out.println("📚 DADOS CADASTRADOS COM SUCESSO! 📚\n");
        livro.mostrarInfo();
        
        // Testando desconto
        System.out.println("\n💰 APLICANDO DESCONTO DE 15%...");
        livro.aplicarDesconto(15.0);
        
        System.out.println("\n✅ PROGRAMA EXECUTADO COM SUCESSO! ✅");
        System.out.println("Tudo funcionou perfeitamente! 🎉");
    }
}

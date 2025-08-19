public class RegistroDeVendas {
    public static void main(String[] args) {
        Autorr autor = new Autorr();
        autor.setNome("José Levy");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-Driven Development");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);
    }
} // tudo isso parece ser meio confuso para mim, mas está sendo interessante, a ideia de polimorfismo é um tanto interessante justamente por voce conseguir usar a classe pai como vertente para instanciar as subclasses e meio que fazer um gancho para os metodos utilizando o super nas subclasses, eu acho isso bem interessante

public class Livro {
    // Atributos do livro
    public String nome;
    public String descricao;
    public double valor;
    public String isbn;
    public Autor autor; // Relacionamento com a classe Autor
    
    // Construtor vazio
    public Livro() {
    }
    
    // Construtor com parâmetros
    public Livro(String nome, String descricao, double valor, String isbn, Autor autor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.isbn = isbn;
        this.autor = autor;
    }
    
    // Método para exibir informações do livro
    public void mostrarInfo() {
        System.out.println("=== INFORMAÇÕES DO LIVRO ===");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: R$ " + String.format("%.2f", valor));
        System.out.println("ISBN: " + isbn);
        System.out.println("============================");
        
        if (autor != null) {
            autor.mostrarInfo();
        }
    }
    
    // Método para aplicar desconto
    public void aplicarDesconto(double porcentagem) {
        if (porcentagem > 0 && porcentagem <= 100) {
            double desconto = valor * (porcentagem / 100);
            valor = valor - desconto;
            System.out.println("Desconto de " + porcentagem + "% aplicado!");
            System.out.println("Novo valor: R$ " + String.format("%.2f", valor));
        } else {
            System.out.println("Porcentagem de desconto inválida!");
        }
    }
}

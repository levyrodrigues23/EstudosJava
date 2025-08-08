public class Autor {
    // Atributos do autor
    public String nome;
    public String email;
    public String cpf;
    
    // Construtor vazio
    public Autor() {
    }
    
    // Construtor com parâmetros
    public Autor(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }
    
    // Método para exibir informações do autor
    public void mostrarInfo() {
        System.out.println("=== INFORMAÇÕES DO AUTOR ===");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + cpf);
        System.out.println("============================");
    }
}

public class Autorr {
    public String nome;
    public String email;
    public String Cpf;

    public Autorr() {

    }

    public Autorr(String nome, String email, String Cpf) {
        this.nome = nome;
        this.email = email;
        this.Cpf = Cpf;
    }

    public void mostrarInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Cpf: " + this.Cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        this.Cpf = cpf;
    }

}

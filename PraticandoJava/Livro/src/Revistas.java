public class Revistas {
    private String nome;
    private String descricao;
    private double valor;
    private Editora editora;
    // automaticamente quando eu mexer com variaveis privadas eu terei de fazer o seguinte: criar os getters e os setters como diz a regra do encapsulamento para não precisar sobrecarregar a classe principal de realizar absolutamente tudo.

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public double getValor(){
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public Editora getEditora(){
        return editora;
    }
    public void setEditora(Editora editora){
        this.editora = editora;
    }


    public boolean AplicaDescontoDe(double porcentagem){
        if(porcentagem > 0.1){
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        return true;
    }
}

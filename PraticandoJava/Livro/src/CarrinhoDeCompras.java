public class CarrinhoDeCompras {
    private double total;


    public void adiciona(livro Livro){
        System.out.println("Adicionando" + Livro);
        Livro.AplicaDescontoDe(0.05);
        total += Livro.getValor();
    }

    public double getTotal(){
        return total;
    }


    // aqui podemos ver o exemplo perfeito do que comumente chamamos de polimorfismo, ou seja, o ato de simplismente usar a classe principal, criando um metodo para ela que podera ser utilizando pelas suas subclasses utilizando o extends do java
}

public class RegrasDeDesconto {
    public static void main(String[] args) {
        Autorr autor = new Autorr();
        autor.setNome("José Levy");
        livro livrooo = new livro(autor);
        livrooo.setValor(66.66);

        if(!livrooo.AplicaDescontoDe(0.3)){
            System.out.println("Desconto não pode ser maior que 30%");
        } else{
            System.out.println("Desconto atualizado com sucesso. Valor do desconto: \n" + livrooo.getValor());
        }

        Ebook ebook = new Ebook(autor);
        ebook.setValor(66.66);

        if(!ebook.AplicaDescontoDe(0.15)){
            System.out.println("Desconto não pode ser acima que 15%");

        } else{
            System.out.println("valor do ebook com desconto: \n" + ebook.getValor());
        }
    }
}

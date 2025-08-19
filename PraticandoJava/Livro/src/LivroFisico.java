public class LivroFisico extends livro {
    public LivroFisico(Autorr autor) {
        super(autor);
    }
    public double getTaxaImpressao(){
        return this.getValor() * 0.05;
    }
    public boolean AplicaDescontoDe(double porcentagem){
        if(porcentagem > 0.3){
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        System.out.println("Desconto: " + desconto);
        return true;
    }
}

// acabei de descobrir sobre metodos abstratos, ou seja, uma classe filha so ira rodar se escrever obrigatoriamente os metodos abstratos da classe pai, nesse caso os livros, seja minilivor ou ebook ou simplismente um Liivro fisico, terão que obrigatoriamente chamar os metodos da classe livro


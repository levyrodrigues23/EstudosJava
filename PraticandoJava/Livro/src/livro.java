public abstract  class livro {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autorr autor;
    private boolean impresso;

// tem algo chamado overloaded, que é o ato de eu poder ter varios construtores dentro da mesma classe
    public livro(Autorr autor){
        // eu criei esse construtor vazio porque ele será necessary para a instância que vou realizar posteriormente
    }

    public livro(String nome, Autorr autor, String descricao, double valor, String isbn){
        this.nome = nome;
        this.autor = autor;
        this.descricao = descricao;
        this.valor = valor;
        this.isbn = isbn;
        this.impresso = true;
    }

    public abstract boolean AplicaDescontoDe(double porcentagem);
    //tornei essa classe aqui abstrata, ou seja, obrigatoriamente eu terei que chamar nas classes filhas esse metodo aqui ;)

    boolean temAutor(){
        return this.autor != null;
    }


    void mostrarDetalhes(){
        System.out.println("nome: " + this.nome);
        System.out.println("Autor: " + this.autor);
        System.out.println("Descricao: " + this.descricao);
        System.out.println("Valor: " + this.valor);
        System.out.println("---------------");
        if (this.temAutor()){
        this.autor.mostrarInformacoes();
        }

    }


    public double getValor(){
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }

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
        // como podemos perceber, todo set que nós estamos criando tem a ver justamente com o retorno, por isso estamos colocando void para dar enfase a esse cenário relevando que ao usar o void, não retornamos absolutamente nada.
    }
    public String getIsbn(){
        return  isbn;
    }

    // é sempre o mesmo processo, pegar o valor pra poder retornar ele para depois, sim, poder modificar e atribuir alguma cosia ao proprio.
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public Autorr getAutor(){
        return autor;

    }
    public void setAutor(Autorr autor){
        this.autor = autor;

    }


    public static void main(String[] args){

            Autorr autor = new Autorr();
            autor.setNome("levy");
            autor.setEmail("levy.com");
            autor.setCpf("123456789");


            livro livroo = new LivroFisico(autor);
            livroo.setNome("java ");
            livroo.setDescricao("javaaaaaaa");
            livroo.setAutor(autor);
            livroo.setIsbn("123456789");
            livroo.setValor(464);



            livroo.mostrarDetalhes();

            Ebook ebook = new Ebook(autor);
            ebook.setNome("levy");
            System.out.println(ebook.getNome());
    }




}


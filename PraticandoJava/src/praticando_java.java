public class praticando_java {

        String titulo;
        Autor autor;
        String descricao;
        double id;

        public praticando_java(){
    // eu criei esse construtor vazio porque ele será necessario para a instancia que vou realizar posteriormente
        }

        public praticando_java(String titulo, Autor autor, String descricao, double id){
            this.titulo = titulo;
            this.autor = autor;
            this.descricao = descricao;
            this.id = id;
        }



    public static void main(String[] args){
        System.out.println("eu imagino se a rita esta vendo este mesmo lugar neste mesmo instante, eu gosto disso, ligados pela luz...");
        praticando_java livro = new praticando_java();
        livro.titulo = "o código da vinci";
        livro.autor = new Autor("levy", "teste@gmail.com");
        livro.id = 2;
        livro.descricao = "não sei o que me tornou assim, mas o que quer que seja, deixou um vazio imenso";
        System.out.println(livro.titulo);
        System.out.println(livro.autor.nome);
        System.out.println(livro.autor.email);
        System.out.println(livro.id);
        System.out.println(livro.descricao);
    }
}

public class praticando_java {

        String titulo;
        Autor autor;
        String descricao;
        double id;
        private double valor;

        public praticando_java(){
    // eu criei esse construtor vazio porque ele será necessary para a instância que vou realizar posteriormente
        }

        public praticando_java(String titulo, Autor autor, String descricao, double id, double valor){
            this.titulo = titulo;
            this.autor = autor;
            this.descricao = descricao;
            this.id = id;
            this.valor = valor;
        }

        boolean temAutor(){
            return this.autor != null;
        }


        void mostrarDetalhes(){
            System.out.println("Titulo: " + this.titulo);
            System.out.println("Autor: " + this.autor);
            System.out.println("Descricao: " + this.descricao);
            System.out.println("Id: " + this.id);
            System.out.println("Valor: " + this.valor);

            if (this.temAutor()){
                autor.mostrarDetalhes();
            }
            System.out.println("---------------");
        }

        public void aplicaDescontoDe(double porcentagem){
            this.valor -= this.valor * porcentagem;
        }
        void adicionaValor(double valor){
            this.valor = valor;
        } // o que eu acabei de criar aqui foi exatamente um comportamento ou metodo como posso chamar para, enfim, ter flexibilidade no código. Ambos os comportamentos são uteis porque o atributo valor é privado, então ele será inacessivel fora da classe, o que me leva a ter que criar dois metodos dentro da classe para servir de base para a instancia de não dar problema no código.

        double retornaValor(){
            return this.valor;
        }

    public static void main(String[] args){
        System.out.println("eu imagino se a rita esta vendo este mesmo lugar neste mesmo instante, eu gosto disso, ligados pela luz...");
        praticando_java livro = new praticando_java();

        livro.titulo = "o código da vinci";
        livro.adicionaValor(34);
        System.out.println("valor: " + livro.retornaValor());
        livro.id = 2;
        livro.descricao = "não sei o que me tornou assim, mas o que quer que seja, deixou um vazio imenso";
        System.out.println(livro.titulo);
        System.out.println(livro.id);
        System.out.println(livro.descricao);
        livro.mostrarDetalhes(); // isso daqui definido ao lado é literalmente uma instancia voltada a mostrar os detalhes, o que comumente chamaos de comportamento, isso segue sendo util pro nosso contexto.
        Autor autor = new Autor();
        autor.nome = "José";
        autor.email = "jose@email.com";
        autor.cpf = "123.456.789-00";

        autor.mostrarDetalhes();

    }
}

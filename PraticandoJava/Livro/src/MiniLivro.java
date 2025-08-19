public class MiniLivro extends livro {
    public MiniLivro(Autorr autor){
        super(autor);
    }

    @Override
    public boolean AplicaDescontoDe(double porcentagem){
        return false;
    }
}

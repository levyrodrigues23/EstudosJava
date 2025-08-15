public class Ebook extends livro {

    private String waterMark;



    public Ebook(Autorr autor){
        super(autor); // eu uso o super para poder acessar o construtor da super classe, ou seja, a classe mãe na qual eu estou estendendo.
    }

    @Override
    public boolean AplicaDescontoDe(double porcentagem){
      if(porcentagem > 0.15){
          return false;
      }
      double desconto = this.getValor() * porcentagem;
      this.setValor(this.getValor() - desconto);
      return true;
    }


    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    public String getWaterMark(){
        return this.waterMark;
    }
}

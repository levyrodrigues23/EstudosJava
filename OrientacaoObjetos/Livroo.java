package OrientacaoObjetos;

public class Livroo {
String nome;
String descricao;
double valor;
String isbn;
String nomeDoAutor;
String emailDoAutor;
String cpfDoAutor;



}

Livroo livro = new Livroo();

//existe algo no java chamado comportamento, que é basicamente o que o objeto faz. Por exemplo, um livro pode ter um comportamento de ser lido, emprestado, vendido, etc. Esses comportamentos são definidos por métodos dentro da classe do objeto.
// voce pode criar uma classe dentro de outra classe, normalmente lidada como atributo, e além disso, é um processo natural chamado de composição.
// outro fato que tende a ser necessariamente interessante tange a forma como as instancias da classe funcionam, principalmente quando relacionamos a ideia do objeto como memoria. Ele não é necessariamente uma copia, muito pelo contrario, ele é uma referencia a um espaço de memoria que guarda os dados do objeto. Isso significa que se você alterar um atributo de um objeto, essa alteração será refletida em todas as referências a esse objeto.
// mais um fato interessante ainda é que se nos criamos dois objetos com as mesmas informações e tentarmos compara-los, eles não serão iguais porque cada objetos tem sua propria instancia na memoria. A referencia tende a ser o endereço e não necessariamente o respectivo valor que foi digitado.
package modulo6.aula5;

public class Quadrinho extends Livro{

    //Atributos da classe quadrinho
    private String desenhista;
    private String colorista;


    //Método construtor da classe quadrinho que chama o método construtor da super classe livro
    public Quadrinho(String autorP, int anoP, String editoraP, int numeroPaginasP, String desenhistaP, String coloristaP){
        super(autorP, anoP, editoraP, numeroPaginasP);
        this.desenhista = desenhistaP;
        this.colorista = coloristaP;

    }
}

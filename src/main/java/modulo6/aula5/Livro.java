package modulo6.aula5;

public class Livro {
    private String autor;
    private int ano;
    private String editora;
    private int numeroPaginas;

    //Método construtor da classe Livro
    public Livro(String autorP, int anoP, String editoraP, int numeroPaginasP){
        this.autor = autorP;
        this.ano = anoP;
        this.editora = editoraP;
        this.numeroPaginas = numeroPaginasP;

    }
}

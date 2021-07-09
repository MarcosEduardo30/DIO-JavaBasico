package modulo6.aula3;

public class Carro {
    //Atributos da classe carro
    public String marca;
    public String modelo;
    public Integer ano;
    public String variante;

    //Método construtor que exige apenas 3 parâmetros
    public Carro(String modeloP, String marcaP, Integer anoP){
        this.modelo = modeloP;
        this.marca = marcaP;
        this.ano = anoP;
    }

    //Método construtor que exige todos os 4 parâmetros
    public Carro(String modeloP, String marcaP, Integer anoP, String varianteP){
        this.modelo = modeloP;
        this.marca = marcaP;
        this.ano = anoP;
        this.variante = varianteP;
    }

    public void mostraDetalhes(){
        if (this.variante == null){
        System.out.printf("Modelo: %s \n Marca: %s \n Ano: %d", this.modelo, this.marca, this.ano);}
        else{
            System.out.printf("Modelo: %s \n Marca: %s \n Ano: %d \n Variante: %s", this.modelo, this.marca, this.ano, this.variante);
        }
    }

}

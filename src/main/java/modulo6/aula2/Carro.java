package modulo6.aula2;

public class Carro {
    Integer passageiros; //Atributo que representa o número de passageiros do carro

    //Método construtor da classe
    public Carro(Integer p){
        passageiros = p;
    };

    //Método que adiciona um número n de passageiros
    public void addpassageiro(Integer n){
        this.passageiros += n;
    };

    //Método que remove um número n de passageiros
    public void rmvpassageiro(Integer n){
        this.passageiros -= n;
    }
}

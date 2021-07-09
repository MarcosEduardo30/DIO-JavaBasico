package modulo6.aula2;

import modulo6.aula2.Carro;

public class Principal {

    public static void main(String[] args){
        Carro teste = new Carro(0);
        System.out.println("Número de passageiros: " + teste.passageiros);
        teste.addpassageiro(2);
        teste.rmvpassageiro(0);
        System.out.println("Número de passageiros: " + teste.passageiros);
    }
}

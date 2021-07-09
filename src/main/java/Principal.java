public class Principal {

    public static void main(String[] args){
        Carro teste = new Carro(0);
        System.out.println(teste.passageiros);
        teste.addpassageiro(2);
        teste.rmvpassageiro(0);
        System.out.println(teste.passageiros);
    }
}

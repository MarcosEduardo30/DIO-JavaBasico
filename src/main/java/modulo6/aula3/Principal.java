package modulo6.aula3;

public class Principal {
    public static void main(String[] args) {
        Carro FiatPalio = new Carro("Palio", "Fiat", 2015);
        Carro ChevroletOnix = new Carro("Onix", "Chevrolet", 2022, "LT 1.0 2022");

        ChevroletOnix.mostraDetalhes();
        System.out.println("\n");
        FiatPalio.mostraDetalhes();
    }
}

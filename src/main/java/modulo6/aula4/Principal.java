package modulo6.aula4;

public class Principal {
    public static void main(String[] args){
        Gerente Geovani = new Gerente(3500.50);
        Supervisor Fabio = new Supervisor(2250.60);
        Atendente Augusto = new Atendente(1500.30);

        System.out.println("O imposto pago pelo gerente Geovani é R$" + Geovani.calcImposto());
        System.out.println("O imposto pago pelo supervisor Fabio é R$" + Fabio.calcImposto());
        System.out.println("O imposto pago pelo supervisor Augusto é R$" + Augusto.calcImposto());
    }
}

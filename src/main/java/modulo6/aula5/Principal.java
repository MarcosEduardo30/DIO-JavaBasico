package modulo6.aula5;

public class Principal {

    public static void main (String[] args){
        Quadrinho Batman = new Quadrinho("Tom King", 2016, "DC Comics", 35, "David Finch", "David Finch");
        Quadrinho Batman2 = new Quadrinho("Tom King", 2016, "DC Comics", 35, "David Finch", "David Finch");
        System.out.println("É igual? " + Batman.equals(Batman2));
    }
}

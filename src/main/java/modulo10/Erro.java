package modulo10;

public class Erro {

    public static void matrizErro(int[] array) throws IndexOutOfBoundsException{
        try{
            System.out.println(array[array.length]);
        } catch (IndexOutOfBoundsException i){
            System.out.println("Erro na matriz");
        }
    }
}

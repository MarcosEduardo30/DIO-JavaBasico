package modulo10;

public class Excecoes {
    public static void main(String[] args) {
        //O código tentará printar a posição 4 do vetor inteiros, como ela não existe, ele mostrará uma mensagem de erro na tela
        int[] inteiros = {1, 2, 3};
        Erro.matrizErro(inteiros);
    }
}

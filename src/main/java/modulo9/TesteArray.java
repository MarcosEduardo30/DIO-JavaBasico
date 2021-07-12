package modulo9;

import java.util.Arrays;

public class TesteArray {
    public static void main(String[] args){
        int[] inteiros = {0, 1, 2, 3, 4};
        inteiros[0] = 10;
        /*for(int i = 0; i < inteiros.length; i++){
            System.out.println(inteiros[i]);
        }*/
        int[][] inteirosMulti = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        for(int i = 0; i < inteirosMulti.length; i++){
            for (int c = 0; c < inteirosMulti[i].length; c++){
                System.out.println(inteirosMulti[i][c]);
            }
        }

    }

}

package modulo8.aula2;

import java.time.Instant;
import java.util.Date;
public class TesteInstant {
    public static void main(String[] args){
        //Gerando uma data com a classe Date
        Date data = new Date();

        //Pegando o valor de Date e o colocando em formato da classe Instant
        Instant teste = data.toInstant();

        //Mostrando ambos os valores para verificar a diferença
        System.out.println(data);
        System.out.println(teste);
    }

}

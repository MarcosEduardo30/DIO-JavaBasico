package modulo8.aula2;

import java.io.PrintStream;
import java.util.Date;
public class Nascimento {
    public static void main(String[] args){
        //Instanciação do objeto nascimento
        Date nascimento = new Date(1028047161000L);

        //Instanciando o objeto comparacao
        Date comparacao = new Date(1273939057000L);

        //Comparando se o conteúdo de nascimento é uma data anterior ou não a de comparacao
        if (nascimento.before(comparacao)){
            System.out.printf("A data %s é anterior a %s", nascimento, comparacao);
        }else {
            System.out.printf("A data %s não é anterior a %s", nascimento, comparacao);
        }
    }
}

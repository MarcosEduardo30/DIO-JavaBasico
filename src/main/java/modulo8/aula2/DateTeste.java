package modulo8.aula2;

import java.util.Date;

public class DateTeste {
    public static void main (String[] args){
        //Instanciando a classe Date com o construtor padrão
        Date data = new Date();

        //Mostrando a data completa. Como o contrutor foi vazio ele pega o milisegundo mais próximo de sua contrução
        System.out.println(data);

        //Instanciando a classe Date passando uma time stamp como parâmetro
        Date dataEpoch = new Date(System.currentTimeMillis());
        System.out.println(dataEpoch);

        //Verificando se a classe data tem uma marcação de tempo anterior a de dataEpoch
        System.out.println(data.before(dataEpoch));
    }
}

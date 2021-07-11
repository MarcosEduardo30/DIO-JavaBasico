package modulo8.aula3;

import java.util.Calendar;
public class TesteCalendar {
    public static void main(String[] args){

        //Instanciando o objeto tempo e printando sua marca de tempo na tela
        Calendar tempo = Calendar.getInstance();
        System.out.println(Calendar.DAY_OF_WEEK);

        //Adicionando 5 dias ao objeto tempo pelo método add e printando na tela
        tempo.add(Calendar.DATE, 5);
        System.out.println(tempo.getTime());

        //Pritando apenas o dia usando a formatação do printf
        System.out.printf("%tD", tempo);
    }
}

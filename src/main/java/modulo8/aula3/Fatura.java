package modulo8.aula3;

import java.util.Calendar;
public class Fatura {

    //Método estático que gera uma data de pagamento ao receber como parâmetro uma data de vencimento
    public static void geraPagamento(Calendar vencimento){
            vencimento.add(Calendar.DATE, 10);
            if (vencimento.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY){
                vencimento.add(Calendar.DATE, 2);
            }
            else if(vencimento.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
                vencimento.add(Calendar.DATE, 1);
            }

            System.out.print("Você pode pagar sua fatura até ");
            System.out.printf("%tD", vencimento);
        }



    }

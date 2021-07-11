package modulo8.aula3;
import java.util.Calendar;

public class Principal {
    public static void main(String[] args){

        //Instanciando o objeto vencimento e mostrando qual seria sua data de pagamento
        Calendar vencimento = Calendar.getInstance();
        Fatura.geraPagamento(vencimento);
    }
}

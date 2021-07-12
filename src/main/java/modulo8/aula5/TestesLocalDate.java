package modulo8.aula5;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class TestesLocalDate {
    public static void main(String[] args){
        //Instanciando um objeto com o LocalDate
        LocalDate data = LocalDate.now();
        System.out.println("A data de hoje é: " + data);

        //Retirando um ano dele usando o método minusYears
        LocalDate dataAnterior = data.minusYears(1);
        System.out.println("A um ano atrás seria: " + dataAnterior);

        //Instanciando um objeto com o LocalTime
        LocalTime horario = LocalTime.now();
        System.out.println("O horário de agora é: " + horario);

        //Acrescentando 30 minutos a ele usando o método plusMinutes
        LocalTime horaFutura = horario.plusMinutes(30);
        System.out.println("Daqui a meia hora será: " + horaFutura);

        //Instanciando um objeto com o LocalDateTime
        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println("A data e a hora de agora é: " + dataHora);

        //Retirando dois anos e 3 horas pelos métodos minusYears e minusHours
        LocalDateTime dataHoraPassado = dataHora.minusYears(2).minusHours(3);
        System.out.println("A 2 anos e 3 horas atrás seria: " + dataHoraPassado);
    }
}

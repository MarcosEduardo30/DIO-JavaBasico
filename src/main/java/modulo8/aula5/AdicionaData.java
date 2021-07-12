package modulo8.aula5;
import java.time.LocalDateTime;
public class AdicionaData {
    public static void main(String[] args){
        LocalDateTime data = LocalDateTime.of(2010, 5, 15, 10, 0);
        System.out.println("A data apresentada foi: " + data);
        LocalDateTime dataAdicionada = data.plusYears(4).plusMonths(6).plusHours(13);
        System.out.println("Essa mesma data com mais 4 anos, 6 meses e 13 horas seria: " + dataAdicionada);
    }
}

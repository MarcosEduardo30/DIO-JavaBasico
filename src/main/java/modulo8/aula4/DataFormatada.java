package modulo8.aula4;

import java.util.Date;
import java.text.SimpleDateFormat;
public class DataFormatada {
    public static void main(String[] args){
        Date dataAtual = new Date();
        SimpleDateFormat formatadorDiaMesAno = new SimpleDateFormat("dd/MM/yy");
        SimpleDateFormat formatadorHoras = new SimpleDateFormat("HH-mm-ss-SS");
        String dataString = formatadorDiaMesAno.format(dataAtual);
        String horaString = formatadorHoras.format(dataAtual);
        System.out.println("Data: " + dataString);
        System.out.println("Horário: " + horaString);
    };
}

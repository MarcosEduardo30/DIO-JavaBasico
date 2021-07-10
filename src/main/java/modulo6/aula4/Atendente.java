package modulo6.aula4;

public class Atendente extends Funcionario {

    public Atendente(double salario){
        this.setSalario(salario);
    }

    //Sobrescrita do método que calcula o imposto da classe funcionário
    @Override
    public double calcImposto() {
        return this.getSalario() * 0.01;
    }
}

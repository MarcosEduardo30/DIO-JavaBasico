package modulo6.aula4;

public class Supervisor extends Funcionario {

    public Supervisor(double salario){
        this.setSalario(salario);
    }

    //Sobrescrita do método que calcula o imposto da classe funcionário
    @Override
    public double calcImposto() {
        return this.getSalario() * 0.05;
    }
}

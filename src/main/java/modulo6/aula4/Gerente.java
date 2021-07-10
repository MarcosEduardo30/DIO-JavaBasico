package modulo6.aula4;

public class Gerente extends Funcionario {

    public Gerente(double salario){
        this.setSalario(salario);
    }

    //Sobrescrita do método que calcula o imposto da classe funcionário
    @Override
    public double calcImposto() {
        return this.getSalario() * 0.1;
    }
}

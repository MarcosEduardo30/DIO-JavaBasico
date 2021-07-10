package modulo6.aula4;

public class Funcionario {
    private double salario;

    //Calculo de imposto para um funcionário genérico
    public double calcImposto(){
        return this.salario * 1;
    }

    //Método get do atributo privado salário
    public double getSalario(){
        return this.salario;
    }

    //Método set do atributo privado salário
    public void setSalario(double salario){
        this.salario = salario;
    }
}

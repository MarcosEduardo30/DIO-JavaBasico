public class Carro {
    Integer passageiros;

    public Carro(Integer p){
        passageiros = p;
    };

    public void addpassageiro(Integer n){
        this.passageiros += n;
    };

    public void rmvpassageiro(Integer n){
        this.passageiros -= n;
    }
}

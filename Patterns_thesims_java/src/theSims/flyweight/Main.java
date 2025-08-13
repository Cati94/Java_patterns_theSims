package theSims.flyweight;

public class Main {
    public static void main(String[] args) {
        Sim s1 = new Sim("Bob");
        Sim s2 = new Sim("Alice");

        Roupa camisa = RoupaFactory.getRoupa("Camisa Vermelha");
        camisa.vestir(s1.nome);
        camisa.vestir(s2.nome);
    }
}

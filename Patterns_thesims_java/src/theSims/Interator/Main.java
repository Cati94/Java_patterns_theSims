package theSims.Interator;

public class Main {
    public static void main(String[] args) {
        ColecaoSims casa = new ColecaoSims();
        casa.adicionar(new Sim("Bob"));
        casa.adicionar(new Sim("Alice"));

        SimIterator it = casa.criarIterator();
        while (it.hasNext()) {
            Sim s = it.next();
            System.out.println(s.nome + " vai dormir.");
        }
    }
}

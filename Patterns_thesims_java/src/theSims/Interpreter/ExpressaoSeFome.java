package theSims.Interpreter;

public class ExpressaoSeFome implements Expressao {
    public void interpretar(Sim sim) {
        if (sim.fome > 70) {
            System.out.println(sim.nome + " vai comer.");
        }
    }
}
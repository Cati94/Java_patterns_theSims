package theSims.Interpreter;

public class ExpressaoSeEnergia implements Expressao {
    public void interpretar(Sim sim) {
        if (sim.energia < 30) {
            System.out.println(sim.nome + " vai dormir.");
        }
    }
}
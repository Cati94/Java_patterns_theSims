package theSims.strategy;

public class Sim {
    private RelaxStrategy strategy;

    public void setRelaxStrategy(RelaxStrategy strategy) {
        this.strategy = strategy;
    }

    public void relax() {
        if (strategy != null)
            strategy.relax();
        else
            System.out.println("O Sim está sem estratégia de relaxamento.");
    }
}

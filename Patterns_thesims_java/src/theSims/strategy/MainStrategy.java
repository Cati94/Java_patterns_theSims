package theSims.strategy;

public class MainStrategy {
    public static void main(String[] args) {
        Sim sim = new Sim();

        sim.setRelaxStrategy(new WatchTV());
        sim.relax();

        sim.setRelaxStrategy(new Swim());
        sim.relax();

        sim.setRelaxStrategy(new Sleep());
        sim.relax();
    }
}


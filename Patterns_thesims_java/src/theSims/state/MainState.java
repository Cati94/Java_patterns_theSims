package theSims.state;

public class MainState {
    public static void main(String[] args) {
        Sim sim = new Sim();

        sim.setState(new HappyState());
        sim.act();

        sim.setState(new HungryState());
        sim.act();

        sim.setState(new TiredState());
        sim.act();
    }
}

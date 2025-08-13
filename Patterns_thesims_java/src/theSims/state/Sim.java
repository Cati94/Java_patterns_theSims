package theSims.state;

public class Sim {
    private SimState state;

    public void setState(SimState state) {
        this.state = state;
    }

    public void act() {
        if (state != null)
            state.act();
        else
            System.out.println("O Sim está sem estado definido.");
    }
}

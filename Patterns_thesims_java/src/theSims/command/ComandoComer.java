package theSims.command;

public class ComandoComer implements Comando {
    private Sim sim;

    public ComandoComer(Sim sim) {
        this.sim = sim;
    }

    @Override
    public void executar() {
        sim.comer();
    }

    @Override
    public void desfazer() {
        sim.pararComer();
    }
}

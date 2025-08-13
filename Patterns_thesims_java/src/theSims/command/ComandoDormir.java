package theSims.command;

public class ComandoDormir implements Comando {
    private Sim sim;

    public ComandoDormir(Sim sim) {
        this.sim = sim;
    }

    @Override
    public void executar() {
        sim.dormir();
    }

    @Override
    public void desfazer() {
        sim.acordar();
    }
}

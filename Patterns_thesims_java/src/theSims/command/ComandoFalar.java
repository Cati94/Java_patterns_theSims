package theSims.command;

public class ComandoFalar implements Comando {
    private Sim sim;
    private String mensagem;

    public ComandoFalar(Sim sim, String mensagem) {
        this.sim = sim;
        this.mensagem = mensagem;
    }

    @Override
    public void executar() {
        sim.falar(mensagem);
    }

    @Override
    public void desfazer() {
        sim.pararFalar();
    }
}

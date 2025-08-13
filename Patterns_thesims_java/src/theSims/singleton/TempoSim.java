package theSims.singleton;

public class TempoSim {
    private static TempoSim instancia;
    private String tempoAtual;

    private TempoSim() {
        tempoAtual = "Dia de sol";
    }

    public static TempoSim getInstancia() {
        if (instancia == null) {
            instancia = new TempoSim();
        }
        return instancia;
    }

    public String getTempoAtual() {
        return tempoAtual;
    }

    public void mudarTempo(String novoTempo) {
        tempoAtual = novoTempo;
    }
}

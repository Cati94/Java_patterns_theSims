package theSims.composite;

import java.util.ArrayList;
import java.util.List;

public class GrupoSim implements SimComponent {
    private List<SimComponent> membros = new ArrayList<>();

    public void adicionar(SimComponent sim) {
        membros.add(sim);
    }

    public void remover(SimComponent sim) {
        membros.remove(sim);
    }

    @Override
    public void executarAcao() {
        for (SimComponent sim : membros) {
            sim.executarAcao();
        }
    }
}

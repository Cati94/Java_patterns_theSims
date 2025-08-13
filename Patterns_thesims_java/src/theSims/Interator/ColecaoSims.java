package theSims.Interator;

import java.util.ArrayList;
import java.util.List;

public class ColecaoSims {
    private List<Sim> sims = new ArrayList<>();
    public void adicionar(Sim sim) { sims.add(sim); }
    public SimIterator criarIterator() { return new SimIterator(sims); }
}

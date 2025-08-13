package theSims.Interator;

import java.util.Iterator;
import java.util.List;

public class SimIterator implements Iterator<Sim> {
    private List<Sim> sims;
    private int posicao = 0;

    public SimIterator(List<Sim> sims) { this.sims = sims; }

    public boolean hasNext() { return posicao < sims.size(); }
    public Sim next() { return sims.get(posicao++); }
}
package theSims.Interpreter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sim sim = new Sim("Bob", 80, 20);

        List<Expressao> regras = new ArrayList<>();
        regras.add(new ExpressaoSeFome());
        regras.add(new ExpressaoSeEnergia());

        for (Expressao regra : regras) {
            regra.interpretar(sim);
        }
    }
}
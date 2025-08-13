package theSims.chain;

public class ManipuladorHigiene extends ManipuladorNecessidade {
    @Override
    protected boolean podeTratar(Necessidade necessidade) {
        return necessidade.nome.equalsIgnoreCase("Higiene") && necessidade.nivel < 50;
    }

    @Override
    protected void tratar(Necessidade necessidade) {
        System.out.println("Tomando um banho relaxante.");
        necessidade.nivel = 100;
    }
}

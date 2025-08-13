package theSims.chain;

public class ManipuladorFome extends ManipuladorNecessidade {
    @Override
    protected boolean podeTratar(Necessidade necessidade) {
        return necessidade.nome.equalsIgnoreCase("Fome") && necessidade.nivel < 50;
    }

    @Override
    protected void tratar(Necessidade necessidade) {
        System.out.println("Comendo uma refeição deliciosa para satisfazer a fome.");
        necessidade.nivel = 100;
    }
}

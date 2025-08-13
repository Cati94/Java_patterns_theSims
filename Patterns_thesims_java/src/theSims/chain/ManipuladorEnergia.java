package theSims.chain;

public class ManipuladorEnergia extends ManipuladorNecessidade {
    @Override
    protected boolean podeTratar(Necessidade necessidade) {
        return necessidade.nome.equalsIgnoreCase("Energia") && necessidade.nivel < 50;
    }

    @Override
    protected void tratar(Necessidade necessidade) {
        System.out.println("Dormindo para recuperar energia.");
        necessidade.nivel = 100;
    }
}

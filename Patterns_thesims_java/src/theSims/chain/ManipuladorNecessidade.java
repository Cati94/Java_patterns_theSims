package theSims.chain;

public abstract class ManipuladorNecessidade {
    protected ManipuladorNecessidade proximo;

    public void setProximo(ManipuladorNecessidade proximo) {
        this.proximo = proximo;
    }

    public void processar(Necessidade necessidade) {
        if (podeTratar(necessidade)) {
            tratar(necessidade);
        } else if (proximo != null) {
            proximo.processar(necessidade);
        } else {
            System.out.println("Nenhum manipulador pôde tratar: " + necessidade.nome);
        }
    }

    protected abstract boolean podeTratar(Necessidade necessidade);
    protected abstract void tratar(Necessidade necessidade);
}

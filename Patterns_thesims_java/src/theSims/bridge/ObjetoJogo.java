package theSims.bridge;

public abstract class ObjetoJogo {
    protected Estilo estilo;

    public ObjetoJogo(Estilo estilo) {
        this.estilo = estilo;
    }

    public abstract void exibir();
}

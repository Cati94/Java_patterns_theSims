package theSims.bridge;

public class TV extends ObjetoJogo {
    public TV(Estilo estilo) {
        super(estilo);
    }

    @Override
    public void exibir() {
        estilo.aplicarEstilo("TV");
    }
}


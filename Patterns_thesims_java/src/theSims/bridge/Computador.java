package theSims.bridge;

public class Computador extends ObjetoJogo {
    public Computador(Estilo estilo) {
        super(estilo);
    }

    @Override
    public void exibir() {
        estilo.aplicarEstilo("Computador");
    }
}


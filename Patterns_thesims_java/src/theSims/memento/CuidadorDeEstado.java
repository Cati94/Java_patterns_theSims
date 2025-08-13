package theSims.memento;

public class CuidadorDeEstado {
    private Memento estadoGuardado;

    public void salvarEstado(Memento m) {
        this.estadoGuardado = m;
    }

    public Memento obterEstado() {
        return estadoGuardado;
    }
}

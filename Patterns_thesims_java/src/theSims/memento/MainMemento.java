package theSims.memento;

public class MainMemento {
    public static void main(String[] args) {
        Sim sim = new Sim("Carlos", 80, "Feliz");
        CuidadorDeEstado cuidador = new CuidadorDeEstado();

        sim.mostrarEstado();
        cuidador.salvarEstado(sim.guardarEstado());

        sim.alterarEstado(30, "Zangado");
        sim.mostrarEstado();

        sim.restaurarEstado(cuidador.obterEstado());
        sim.mostrarEstado();
    }
}

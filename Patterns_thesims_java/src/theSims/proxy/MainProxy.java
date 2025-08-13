package theSims.proxy;

public class MainProxy {
    public static void main(String[] args) {
        SimInterface sim = new SimProxy("Leonor");

        sim.verEstado();    // Permite ver
        sim.interagir();    // Bloqueia interação
    }
}

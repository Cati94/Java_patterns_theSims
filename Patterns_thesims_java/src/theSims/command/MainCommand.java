package theSims.command;

public class MainCommand {
    public static void main(String[] args) {
        Sim bob = new Sim("Bob");
        ControladorSim controlador = new ControladorSim();

        controlador.executarComando(new ComandoComer(bob));
        controlador.executarComando(new ComandoFalar(bob, "Olá!"));
        controlador.executarComando(new ComandoDormir(bob));

        System.out.println("\n--- Desfazendo últimas ações ---");
        controlador.desfazerUltimo();
        controlador.desfazerUltimo();
    }
}

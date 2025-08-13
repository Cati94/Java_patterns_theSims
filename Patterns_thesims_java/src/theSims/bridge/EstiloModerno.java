package theSims.bridge;

public class EstiloModerno implements Estilo {
    @Override
    public void aplicarEstilo(String objeto) {
        System.out.println(objeto + " com design moderno e minimalista.");
    }
}


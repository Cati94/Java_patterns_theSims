package theSims.bridge;

public class EstiloRetro implements Estilo {
    @Override
    public void aplicarEstilo(String objeto) {
        System.out.println(objeto + " com visual retro e detalhes antigos.");
    }
}

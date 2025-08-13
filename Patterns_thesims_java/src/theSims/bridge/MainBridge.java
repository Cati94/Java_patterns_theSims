package theSims.bridge;

public class MainBridge {
    public static void main(String[] args) {
        ObjetoJogo tvModerna = new TV(new EstiloModerno());
        tvModerna.exibir();

        ObjetoJogo tvRetro = new TV(new EstiloRetro());
        tvRetro.exibir();

        ObjetoJogo pcRetro = new Computador(new EstiloRetro());
        pcRetro.exibir();
    }
}

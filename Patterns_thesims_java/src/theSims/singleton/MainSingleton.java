package theSims.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        TempoSim tempo1 = TempoSim.getInstancia();
        TempoSim tempo2 = TempoSim.getInstancia();

        System.out.println("Tempo inicial: " + tempo1.getTempoAtual());
        tempo2.mudarTempo("Chuva");

        // Verifica se tempo1 e tempo2 são a mesma instância
        System.out.println("Tempo após mudança: " + tempo1.getTempoAtual());
        System.out.println("São a mesma instância? " + (tempo1 == tempo2));
    }
}

package theSims.observer;

public class MainObserver {
    public static void main(String[] args) {
        Sim sim = new Sim("Alex");
        AmigoSim amigo = new AmigoSim("Chris");
        Ambiente ambiente = new Ambiente();

        sim.adicionarObservador(amigo);
        sim.adicionarObservador(ambiente);

        sim.setHumor("Feliz");
        System.out.println();
        sim.setHumor("Triste");
        System.out.println();
        sim.setHumor("Estressado");
    }
}

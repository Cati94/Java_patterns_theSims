package theSims.composite;

public class MainComposite {
    public static void main(String[] args) {
        SimIndividual sim1 = new SimIndividual("Carlos");
        SimIndividual sim2 = new SimIndividual("Ana");

        GrupoSim familia = new GrupoSim();
        familia.adicionar(sim1);
        familia.adicionar(sim2);

        System.out.println("Toda a família:");
        familia.executarAcao(); // Todos dançam
    }
}

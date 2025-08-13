package theSims.AbstractFactory;

public class Jogo {
    public static void main(String[] args) {
        // Jogador escolhe estilo moderno
        FabricaFamilia fabrica = new FabricaModerna();
        Sim sim1 = fabrica.criarSim();
        Casa casa1 = fabrica.criarCasa();

        sim1.descricao();
        casa1.descricao();

        System.out.println("----");

        // Jogador escolhe estilo medieval
        fabrica = new FabricaMedieval();
        Sim sim2 = fabrica.criarSim();
        Casa casa2 = fabrica.criarCasa();

        sim2.descricao();
        casa2.descricao();
    }
}

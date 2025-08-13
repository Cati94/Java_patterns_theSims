package theSims.chain;

public class MainChain {
    public static void main(String[] args) {
        // Criar manipuladores
        ManipuladorNecessidade fome = new ManipuladorFome();
        ManipuladorNecessidade energia = new ManipuladorEnergia();
        ManipuladorNecessidade higiene = new ManipuladorHigiene();

        // Encadear manipuladores
        fome.setProximo(energia);
        energia.setProximo(higiene);

        // Necessidades para processar
        Necessidade[] necessidades = {
            new Necessidade("Fome", 20),
            new Necessidade("Energia", 80),
            new Necessidade("Higiene", 30),
            new Necessidade("Diversão", 40) // não tratada
        };

        // Processar cada necessidade
        for (Necessidade n : necessidades) {
            fome.processar(n);
            System.out.println("Nível final de " + n.nome + ": " + n.nivel + "\n");
        }
    }
}

package theSims.observer;

public class AmigoSim implements ObservadorHumor {
    private String nome;

    public AmigoSim(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String novoHumor) {
        if (novoHumor.equalsIgnoreCase("Triste")) {
            System.out.println(nome + " consola o Sim porque ele está triste.");
        } else if (novoHumor.equalsIgnoreCase("Feliz")) {
            System.out.println(nome + " comemora com o Sim porque ele está feliz!");
        } else {
            System.out.println(nome + " nota que o Sim está com humor: " + novoHumor);
        }
    }
}

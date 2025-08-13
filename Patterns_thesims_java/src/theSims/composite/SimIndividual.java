package theSims.composite;

public class SimIndividual implements SimComponent {
    private String nome;

    public SimIndividual(String nome) {
        this.nome = nome;
    }

    @Override
    public void executarAcao() {
        System.out.println(nome + " está a dançar!");
    }
}

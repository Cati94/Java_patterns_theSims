package theSims.proxy;

public class SimReal implements SimInterface {
    private String nome;

    public SimReal(String nome) {
        this.nome = nome;
    }

    @Override
    public void verEstado() {
        System.out.println(nome + " está a brincar no quintal.");
    }

    @Override
    public void interagir() {
        System.out.println("A brincar com " + nome);
    }
}

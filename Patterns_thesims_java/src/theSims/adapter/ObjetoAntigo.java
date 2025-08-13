package theSims.adapter;

public class ObjetoAntigo {
    private String nome;

    public ObjetoAntigo(String nome) {
        this.nome = nome;
    }

    public void usarObjetoAntigo() {
        System.out.println("O Sim está a usar o objeto antigo: " + nome);
    }
}

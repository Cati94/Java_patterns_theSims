package theSims.adapter;

public class ObjetoNovo implements InteracaoNova {
    private String nome;

    public ObjetoNovo(String nome) {
        this.nome = nome;
    }

    @Override
    public void interagir() {
        System.out.println("O Sim está a usar o novo objeto: " + nome);
    }
}

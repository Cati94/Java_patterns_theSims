package theSims.visitor;

public class Crianca implements Sim {
    private String nome;

    public Crianca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void aceitar(Visitor v) {
        v.visitarCrianca(this);
    }
}

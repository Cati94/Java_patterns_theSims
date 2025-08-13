package theSims.visitor;

public class Adulto implements Sim {
    private String nome;

    public Adulto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void aceitar(Visitor v) {
        v.visitarAdulto(this);
    }
}

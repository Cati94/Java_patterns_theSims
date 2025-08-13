package theSims.factorymethod;

public abstract class Sim {
	protected String nome;
    public Sim(String nome) {
        this.nome = nome;
    }
    public abstract void agir();

}

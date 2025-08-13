package theSims.factorymethod;

public class SimAdulto  extends Sim {
    public SimAdulto(String nome) { super(nome); }
    @Override
    public void agir() {
        System.out.println(nome + " está trabalhando.");
    }
}

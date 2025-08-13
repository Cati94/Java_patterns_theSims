package theSims.factorymethod;


public class SimIdoso extends Sim {
    public SimIdoso(String nome) { super(nome); }
    @Override
    public void agir() {
        System.out.println(nome + " está descansando.");
    }
}

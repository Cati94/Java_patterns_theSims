package theSims.factorymethod;

public class SimCrianca extends Sim {
    public SimCrianca(String nome) { super(nome); }
    @Override
    public void agir() {
        System.out.println(nome + " está brincando.");
    }
}

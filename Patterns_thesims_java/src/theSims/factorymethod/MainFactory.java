package theSims.factorymethod;

public class MainFactory {
    public static void main(String[] args) {
        Sim s1 = SimFactory.criarSim("adulto", "Bob");
        Sim s2 = SimFactory.criarSim("crianca", "Ana");
        Sim s3 = SimFactory.criarSim("idoso", "João");

        s1.agir();
        s2.agir();
        s3.agir();
    }
}

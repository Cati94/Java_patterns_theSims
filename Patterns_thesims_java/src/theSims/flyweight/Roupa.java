package theSims.flyweight;

public class Roupa {
    private String modelo;
    public Roupa(String modelo) {
        this.modelo = modelo;
    }
    public void vestir(String nomeSim) {
        System.out.println(nomeSim + " vestiu " + modelo);
    }
}
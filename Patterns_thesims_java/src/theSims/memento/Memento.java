package theSims.memento;

public class Memento {
    private final int energia;
    private final String humor;

    public Memento(int energia, String humor) {
        this.energia = energia;
        this.humor = humor;
    }

    public int getEnergia() {
        return energia;
    }

    public String getHumor() {
        return humor;
    }
}

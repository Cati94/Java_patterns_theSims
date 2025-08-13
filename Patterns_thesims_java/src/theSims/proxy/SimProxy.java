package theSims.proxy;

public class SimProxy implements SimInterface {
    private SimReal simReal;
    private String nome;

    public SimProxy(String nome) {
        this.nome = nome;
    }

    @Override
    public void verEstado() {
        if (simReal == null) {
            simReal = new SimReal(nome);
        }
        simReal.verEstado();
    }

    @Override
    public void interagir() {
        System.out.println("Modo espetador: não é possível interagir com " + nome);
    }
}

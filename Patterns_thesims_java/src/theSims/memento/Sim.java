package theSims.memento;

public class Sim {
    private String nome;
    private int energia;
    private String humor;

    public Sim(String nome, int energia, String humor) {
        this.nome = nome;
        this.energia = energia;
        this.humor = humor;
    }

    public Memento guardarEstado() {
        return new Memento(energia, humor);
    }

    public void restaurarEstado(Memento m) {
        this.energia = m.getEnergia();
        this.humor = m.getHumor();
    }

    public void mostrarEstado() {
        System.out.println(nome + " | Energia: " + energia + " | Humor: " + humor);
    }

    public void alterarEstado(int novaEnergia, String novoHumor) {
        this.energia = novaEnergia;
        this.humor = novoHumor;
    }
}

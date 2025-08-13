package theSims.command;

public class Sim {
    private String nome;

    public Sim(String nome) {
        this.nome = nome;
    }

    public void comer() {
        System.out.println(nome + " está a comer.");
    }

    public void pararComer() {
        System.out.println(nome + " parou de comer.");
    }

    public void dormir() {
        System.out.println(nome + " está a dormir.");
    }

    public void acordar() {
        System.out.println(nome + " acordou.");
    }

    public void falar(String mensagem) {
        System.out.println(nome + " diz: " + mensagem);
    }

    public void pararFalar() {
        System.out.println(nome + " parou de falar.");
    }
}

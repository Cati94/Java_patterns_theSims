package theSims.prototype;

public class Sim implements Cloneable {
    private String nome;
    private String humor;
    private int energia;

    public Sim(String nome, String humor, int energia) {
        this.nome = nome;
        this.humor = humor;
        this.energia = energia;
    }

    public void exibir() {
        System.out.println(nome + " | Humor: " + humor + " | Energia: " + energia);
    }

    @Override
    public Sim clone() {
        try {
            return (Sim) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Erro ao clonar o Sim.");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

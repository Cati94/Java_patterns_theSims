package theSims.builder;


public class Sim {
    private String nome;
    private String idade;
    private String cabelo;
    private String roupa;
    private String personalidade;

    public Sim(String nome, String idade, String cabelo, String roupa, String personalidade) {
        this.nome = nome;
        this.idade = idade;
        this.cabelo = cabelo;
        this.roupa = roupa;
        this.personalidade = personalidade;
    }

    public void mostrarInfo() {
        System.out.println("Sim: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cabelo: " + cabelo);
        System.out.println("Roupa: " + roupa);
        System.out.println("Personalidade: " + personalidade);
        System.out.println("----------------------------");
    }
}


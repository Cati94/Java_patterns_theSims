package theSims.builder;

public class SimBuilder {
    private String nome;
    private String idade;
    private String cabelo;
    private String roupa;
    private String personalidade;

    public SimBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public SimBuilder setIdade(String idade) {
        this.idade = idade;
        return this;
    }

    public SimBuilder setCabelo(String cabelo) {
        this.cabelo = cabelo;
        return this;
    }

    public SimBuilder setRoupa(String roupa) {
        this.roupa = roupa;
        return this;
    }

    public SimBuilder setPersonalidade(String personalidade) {
        this.personalidade = personalidade;
        return this;
    }

    public Sim build() {
        return new Sim(nome, idade, cabelo, roupa, personalidade);
    }
}

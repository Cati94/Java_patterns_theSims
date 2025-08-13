package theSims.chain;

public class Necessidade {
    String nome;
    int nivel; // 0 = crítico, 100 = cheio

    public Necessidade(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }
}

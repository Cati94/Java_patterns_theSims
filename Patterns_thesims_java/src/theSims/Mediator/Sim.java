package theSims.Mediator;

abstract class Sim {
    protected Mediador mediador;
    protected String nome;

    public Sim(String nome, Mediador mediador) {
        this.nome = nome;
        this.mediador = mediador;
    }

    public abstract void receberMensagem(String mensagem);

    public void enviarMensagem(String mensagem) {
        System.out.println(this.nome + " enviou: " + mensagem);
        mediador.enviarMensagem(mensagem, this);
    }
}

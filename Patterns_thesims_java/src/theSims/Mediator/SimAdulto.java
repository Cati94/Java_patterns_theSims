package theSims.Mediator;

class SimAdulto extends Sim {
    public SimAdulto(String nome, Mediador mediador) {
        super(nome, mediador);
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println(nome + " (adulto) recebeu: " + mensagem);
    }
}
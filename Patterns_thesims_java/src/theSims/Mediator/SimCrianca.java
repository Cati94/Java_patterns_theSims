package theSims.Mediator;

class SimCrianca extends Sim {
    public SimCrianca(String nome, Mediador mediador) {
        super(nome, mediador);
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println(nome + " (criança) recebeu: " + mensagem);
        }
}
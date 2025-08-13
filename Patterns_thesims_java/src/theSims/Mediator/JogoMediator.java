package theSims.Mediator;

public class JogoMediator {
    public static void main(String[] args) {
        MediadorConcreto mediador = new MediadorConcreto();

        Sim adulto = new SimAdulto("Carlos", mediador);
        Sim crianca = new SimCrianca("Ana", mediador);

        mediador.adicionarParticipante(adulto);
        mediador.adicionarParticipante(crianca);

        adulto.enviarMensagem("Olá, Ana! Vamos jogar?");
        crianca.enviarMensagem("Sim, Carlos! Vamos construir uma casa.");
    }
}

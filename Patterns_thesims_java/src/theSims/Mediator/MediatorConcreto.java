package theSims.Mediator;

import java.util.ArrayList;
import java.util.List;

class MediadorConcreto implements Mediador {
    private List<Sim> participantes = new ArrayList<>();

    public void adicionarParticipante(Sim sim) {
        participantes.add(sim);
    }

    @Override
    public void enviarMensagem(String mensagem, Sim remetente) {
        for (Sim sim : participantes) {
            // não enviar para quem enviou
            if (sim != remetente) {
                sim.receberMensagem(mensagem);
            }
        }
    }
}

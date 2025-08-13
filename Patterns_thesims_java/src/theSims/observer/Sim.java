package theSims.observer;

import java.util.ArrayList;
import java.util.List;

public class Sim {
    private String nome;
    private String humor;

    private List<ObservadorHumor> observadores = new ArrayList<>();

    public Sim(String nome) {
        this.nome = nome;
        this.humor = "Neutro";
    }

    public void adicionarObservador(ObservadorHumor o) {
        observadores.add(o);
    }

    public void removerObservador(ObservadorHumor o) {
        observadores.remove(o);
    }

    public void setHumor(String humor) {
        this.humor = humor;
        System.out.println(nome + " mudou o humor para: " + humor);
        notificarObservadores();
    }

    public String getHumor() {
        return humor;
    }

    private void notificarObservadores() {
        for (ObservadorHumor o : observadores) {
            o.atualizar(humor);
        }
    }
}

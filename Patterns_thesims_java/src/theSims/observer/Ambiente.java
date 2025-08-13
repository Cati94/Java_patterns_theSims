package theSims.observer;

public class Ambiente implements ObservadorHumor {

    @Override
    public void atualizar(String novoHumor) {
        if (novoHumor.equalsIgnoreCase("Estressado")) {
            System.out.println("O ambiente fica caótico com o Sim estressado.");
        } else {
            System.out.println("O ambiente está calmo.");
        }
    }
}

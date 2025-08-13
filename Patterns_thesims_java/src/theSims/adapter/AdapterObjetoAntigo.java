package theSims.adapter;

public class AdapterObjetoAntigo implements InteracaoNova {
    private ObjetoAntigo objetoAntigo;

    public AdapterObjetoAntigo(ObjetoAntigo objetoAntigo) {
        this.objetoAntigo = objetoAntigo;
    }

    @Override
    public void interagir() {
        // Aqui adaptamos o método antigo para o formato novo
        objetoAntigo.usarObjetoAntigo();
    }
}

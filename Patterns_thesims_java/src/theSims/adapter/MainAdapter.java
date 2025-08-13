package theSims.adapter;

public class MainAdapter {
    public static void main(String[] args) {
        InteracaoNova tvNova = new ObjetoNovo("TV 4K");
        tvNova.interagir();

        ObjetoAntigo tvAntiga = new ObjetoAntigo("TV a preto e branco");
        InteracaoNova tvAntigaAdaptada = new AdapterObjetoAntigo(tvAntiga);
        tvAntigaAdaptada.interagir();
    }
}

package theSims.facade;

public class CozinhaFacade {
    private Fogao fogao = new Fogao();
    private Frigorifico frigorifico = new Frigorifico();
    private AnimacaoCozinhar animacao = new AnimacaoCozinhar();

    public void prepararRefeicao(Sim sim, String prato) {
        System.out.println(sim.nome + " está preparando " + prato);
        frigorifico.pegarIngredientes(prato);
        fogao.aquecer();
        animacao.executar(prato);
        System.out.println(prato + " pronto!");
    }
}
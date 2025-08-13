package theSims.facade;

public class Main {
    public static void main(String[] args) {
        Sim sim = new Sim("Alice");
        CozinhaFacade cozinha = new CozinhaFacade();
        cozinha.prepararRefeicao(sim, "Macarrão");
    }
}
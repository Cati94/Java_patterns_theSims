package theSims.visitor;

public class MainVisitor {
    public static void main(String[] args) {
        Sim adulto = new Adulto("Carlos");
        Sim crianca = new Crianca("Lia");

        Visitor interacao = new InteracaoSocial();
        Visitor cuidado = new CuidadoSim();

        System.out.println("--- Interações Sociais ---");
        adulto.aceitar(interacao);
        crianca.aceitar(interacao);

        System.out.println("\n--- Cuidados ---");
        adulto.aceitar(cuidado);
        crianca.aceitar(cuidado);
    }
}

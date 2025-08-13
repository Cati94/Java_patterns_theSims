package theSims.visitor;

public class InteracaoSocial implements Visitor {

    @Override
    public void visitarAdulto(Adulto adulto) {
        System.out.println("Conversando sobre trabalho com " + adulto.getNome());
    }

    @Override
    public void visitarCrianca(Crianca crianca) {
        System.out.println("Brincando no parque com " + crianca.getNome());
    }
}

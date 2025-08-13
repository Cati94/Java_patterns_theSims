package theSims.visitor;

public class CuidadoSim implements Visitor {

    @Override
    public void visitarAdulto(Adulto adulto) {
        System.out.println("Servindo café para " + adulto.getNome());
    }

    @Override
    public void visitarCrianca(Crianca crianca) {
        System.out.println("Dando leite e biscoitos para " + crianca.getNome());
    }
}

package theSims.template;

public class SimAtivo extends RotinaMatinal {
    @Override
    protected void levantar() {
        System.out.println("Sim ativo levanta-se cedo.");
    }

    @Override
    protected void tomarPequenoAlmoco() {
        System.out.println("Come cereais e sumo de laranja.");
    }

    @Override
    protected void fazerAtividade() {
        System.out.println("Vai correr no parque.");
    }
}

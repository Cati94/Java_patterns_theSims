package theSims.template;

public class SimPreguicoso extends RotinaMatinal {
    @Override
    protected void levantar() {
        System.out.println("Sim preguiçoso fica na cama até tarde.");
    }

    @Override
    protected void tomarPequenoAlmoco() {
        System.out.println("Toma um café rápido.");
    }

    @Override
    protected void fazerAtividade() {
        System.out.println("Fica no sofá a ver TV.");
    }
}

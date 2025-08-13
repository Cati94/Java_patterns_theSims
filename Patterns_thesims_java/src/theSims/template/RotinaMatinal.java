package theSims.template;

public abstract class RotinaMatinal {
    public final void executarRotina() {
        levantar();
        tomarPequenoAlmoco();
        fazerAtividade();
    }

    protected abstract void levantar();
    protected abstract void tomarPequenoAlmoco();
    protected abstract void fazerAtividade();
}

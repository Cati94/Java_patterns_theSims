package theSims.decorator;

public abstract class DecoratorObjeto implements ObjetoSim {
    protected ObjetoSim objeto;

    public DecoratorObjeto(ObjetoSim objeto) {
        this.objeto = objeto;
    }

    @Override
    public void usar() {
        objeto.usar();
    }
}

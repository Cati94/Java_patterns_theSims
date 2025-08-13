package theSims.decorator;

public class TVComCanaisPremium extends DecoratorObjeto {
    public TVComCanaisPremium(ObjetoSim objeto) {
        super(objeto);
    }

    @Override
    public void usar() {
        super.usar();
        System.out.println("Agora com canais premium desbloqueados!");
    }
}

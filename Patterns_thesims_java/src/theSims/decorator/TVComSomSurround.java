package theSims.decorator;

public class TVComSomSurround extends DecoratorObjeto {
    public TVComSomSurround(ObjetoSim objeto) {
        super(objeto);
    }

    @Override
    public void usar() {
        super.usar();
        System.out.println("Som surround ativado para uma experiência imersiva!");
    }
}

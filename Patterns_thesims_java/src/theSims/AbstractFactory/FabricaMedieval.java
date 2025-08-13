package theSims.AbstractFactory;

class FabricaMedieval implements FabricaFamilia {
    public Sim criarSim() {
        return new SimMedieval();
    }
    public Casa criarCasa() {
        return new CasaMedieval();
    }
}

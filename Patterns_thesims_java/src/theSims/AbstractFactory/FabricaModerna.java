package theSims.AbstractFactory;

class FabricaModerna implements FabricaFamilia {
    public Sim criarSim() {
        return new SimModerno();
    }
    public Casa criarCasa() {
        return new CasaModerna();
    }
}

package theSims.factorymethod;

public class SimFactory {
	public static Sim criarSim(String tipo, String nome) {
        switch (tipo.toLowerCase()) {
            case "adulto": return new SimAdulto(nome);
            case "crianca": return new SimCrianca(nome);
            case "idoso": return new SimIdoso(nome);
            default: throw new IllegalArgumentException("Tipo desconhecido: " + tipo);
        }
    }
}

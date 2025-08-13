package theSims.prototype;

public class MainPrototype {
    public static void main(String[] args) {
        Sim simOriginal = new Sim("Alice", "Feliz", 80);
        Sim simClonado = simOriginal.clone();

        simOriginal.exibir();
        simClonado.setNome("Clonada");
        simClonado.exibir();
    }
}

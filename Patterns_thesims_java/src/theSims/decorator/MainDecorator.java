package theSims.decorator;

public class MainDecorator {
    public static void main(String[] args) {
        // TV simples
        ObjetoSim tv = new TVSimples();
        tv.usar();

        System.out.println();

        // TV com canais premium
        ObjetoSim tvPremium = new TVComCanaisPremium(new TVSimples());
        tvPremium.usar();

        System.out.println();

        // TV com canais premium + som surround
        ObjetoSim tvFull = new TVComSomSurround(new TVComCanaisPremium(new TVSimples()));
        tvFull.usar();
    }
}

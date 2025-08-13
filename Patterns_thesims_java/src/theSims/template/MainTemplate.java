package theSims.template;

public class MainTemplate {
    public static void main(String[] args) {
        RotinaMatinal sim1 = new SimAtivo();
        RotinaMatinal sim2 = new SimPreguicoso();

        System.out.println("Rotina do Sim Ativo:");
        sim1.executarRotina();

        System.out.println("\nRotina do Sim Preguiçoso:");
        sim2.executarRotina();
    }
}

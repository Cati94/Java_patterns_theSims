package theSims.builder;

public class MainBuilder {
    public static void main(String[] args) {
        Sim sim1 = new SimBuilder()
                .setNome("Clara")
                .setIdade("Adulto")
                .setCabelo("Cabelo castanho longo")
                .setRoupa("Vestido vermelho")
                .setPersonalidade("Criativa")
                .build();

        Sim sim2 = new SimBuilder()
                .setNome("Lucas")
                .setIdade("Criança")
                .setCabelo("Cabelo preto curto")
                .setRoupa("Calças jeans e t-shirt azul")
                .setPersonalidade("Brincalhão")
                .build();

        sim1.mostrarInfo();
        sim2.mostrarInfo();
    }
}

public class main {

    static void main(String[] args) {

        MedidorElectrico medidor1 = new MedidorElectrico(
                "A1234",
                1240,
                1250
        );

        System.out.println(medidor1.calcularConsumo() + " KwH");
        medidor1.registrarNuevaLectura(1300);
        System.out.println(medidor1.calcularConsumo() + " KwH");

    }
}

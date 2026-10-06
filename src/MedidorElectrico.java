public class MedidorElectrico {

    String numeroMedidor;
    double lecturaAnterior;
    double lecturaActual;

    public MedidorElectrico (String numeroMedidor, double lecturaAnterior, double lecturaActual) {
        this.numeroMedidor = numeroMedidor;
        this.lecturaAnterior = lecturaAnterior;

        if (lecturaActual >= lecturaAnterior) {
            this.lecturaActual = lecturaActual;
        }
        else {
            System.out.println("CONSUMO INVALIDO.");
        }
    }

     double calcularConsumo () {
        return this.lecturaActual - this.lecturaAnterior ;
     }

    void registrarNuevaLectura(double nuevaLectura) {
        if (nuevaLectura >= lecturaActual) {
            this.lecturaAnterior = this.lecturaActual;
            this.lecturaActual = nuevaLectura;
        }
        else {
            System.out.println("CONSUMO INVALIDO.");
        }

    }
}

import java.util.Scanner;

class RentaCamara {

    public static double calcularRenta(double tarifa, double horas) {
        double total = tarifa * horas;
        return total;
    }

    public static void mostrarComprobante(double total) {
        System.out.println("El total a pagar por el cliente es: $" + total);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double tarifa;
        double horas;

        System.out.println("Calcular el costo de renta de camaras");
        System.out.print("Ingrese la tarifa de alquiler por hora: $");
        tarifa = teclado.nextDouble();

        System.out.print("Cantidad de horas de uso: ");
        horas = teclado.nextDouble();

        if (tarifa <= 0) {
            System.out.println("La tarifa debe ser mayor que cero.");
        } else if (horas <= 0) {
            System.out.println("Las horas deben ser mayores que cero.");
        } else {
            double total = calcularRenta(tarifa, horas);
            mostrarComprobante(total);
        }
    }
}

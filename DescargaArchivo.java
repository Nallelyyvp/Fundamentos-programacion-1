import java.util.Scanner;

class TiempoDescarga {

    public static double calcularTiempo(double tamaño, double velocidad) {
        double tiempo = tamaño / velocidad;
        return tiempo;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double tamañoArchivo;
        double velocidadDescarga;

        System.out.println("Calcular el tiempo de descarga");
        System.out.print("Ingrese el tamaño del archivo en MB: ");
        tamañoArchivo = teclado.nextDouble();

        System.out.print("Ingrese la velocidad de descarga en MB/s: ");
        velocidadDescarga = teclado.nextDouble();

        if (tamañoArchivo < 0) {
            System.out.println("El tamaño del archivo no puede ser negativo.");
        } else if (velocidadDescarga <= 0) {
            System.out.println("La velocidad debe ser mayor que cero.");
        } else {
            double resultado = calcularTiempo(tamañoArchivo, velocidadDescarga);
            System.out.println("El tiempo estimado de descarga es: " + resultado + " segundos.");
        }
    }
}

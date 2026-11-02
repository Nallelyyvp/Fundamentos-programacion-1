public class Main {

    public static void mostrarEtiqueta(String numeroGuia, String destino, double peso) {
        System.out.println("Etiqueta del paquete");
        System.out.println("Numero de guia: " + numeroGuia);
        System.out.println("Destino: " + destino);
        System.out.println("Peso: " + peso + " kg");
    }

    public static void main(String[] args) {
        mostrarEtiqueta("GUIA-6767", "Temixco", 6.7);
        mostrarEtiqueta("GUIA-3336", "Cuernavaca", 17.11);
    }
}

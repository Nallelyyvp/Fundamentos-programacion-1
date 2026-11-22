import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] notas = pedirNotas();
        mostrarNotas(notas);
        int pasaron = contarPasaron(notas);
        int noPasaron = contarNoPasaron(notas);
        System.out.println("Alumnos aprobados: " + pasaron);
        System.out.println("Alumnos reprobados: " + noPasaron);
    }

    public static int[] pedirNotas() {
        Scanner teclado = new Scanner(System.in);
        int[] notas = new int[10];
        for (int x = 0; x < 10; x++) {
            System.out.print("Captura la calificación del alumno " + (x + 1) + ": ");
            int n = teclado.nextInt();
            while (n < 0 || n > 100) {
                System.out.println("Esa calificación no se puede, de 0 a 100");
                System.out.print("Captura la calificación del alumno " + (x + 1) + ": ");
                n = teclado.nextInt();
            }
            notas[x] = n;
        }
        return notas;
    }

    public static void mostrarNotas(int[] notas) {
        System.out.println("Calificaciones capturadas:");
        for (int x = 0; x < 10; x++) {
            System.out.println("Alumno " + (x + 1) + ": " + notas[x]);
        }
    }

    public static int contarPasaron(int[] notas) {
        int total = 0;
        for (int x = 0; x < 10; x++) {
            if (notas[x] >= 70) {
                total = total + 1;
            }
        }
        return total;
    }

    public static int contarNoPasaron(int[] notas) {
        int total = 0;
        for (int x = 0; x < 10; x++) {
            if (notas[x] < 70) {
                total = total + 1;
            }
        }
        return total;
    }
}

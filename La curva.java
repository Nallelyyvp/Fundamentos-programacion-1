public class Main {

    public static void imprimirNotas(int[] notas) {
        for (int x = 0; x < 10; x++) {
            int n = x + 1;
            System.out.println("Estudiante " + n + " = " + notas[x]);
        }
        System.out.println();
    }

    public static void sumarPuntos(int[] notas) {
        for (int x = 0; x < 10; x++) {
            notas[x] = notas[x] + 5;
            if (notas[x] > 100) {
                notas[x] = 100;
            }
        }
    }

    public static void cuantosPasan(int[] notas) {
        int cont = 0;
        for (int x = 0; x < 10; x++) {
            if (notas[x] >= 70) {
                cont = cont + 1;
            }
        }
        System.out.println("Total de aprobados = " + cont);
    }

    public static void main(String[] args) {
        int[] notas = {55, 68, 72, 90, 61, 98, 45, 77, 83, 59};

        imprimirNotas(notas);
        sumarPuntos(notas);
        imprimirNotas(notas);
        cuantosPasan(notas);
    }
}

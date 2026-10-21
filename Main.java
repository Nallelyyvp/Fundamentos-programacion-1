import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        // El jugador comienza con 100 puntos
        int puntos = 100;
        int opc;

        do {
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1. Ganar 20 puntos");
            System.out.println("2. Gastar 15 puntos");
            System.out.println("3. Consultar puntos");
            System.out.println("4. Salir");
            System.out.print("Ingresa una opción: ");
            
            opc = teclado.nextInt();

            switch (opc) {
                case 1:
                    puntos += 20; // Suma 20 puntos
                    System.out.println("¡Has ganado 20 puntos! Puntos actuales: " + puntos);
                    break;

                case 2:
                    // Validación: No puede gastar si tiene menos de 15 puntos
                    if (puntos >= 15) {
                        puntos -= 15; // Descuenta 15 puntos
                        System.out.println("Has gastado 15 puntos. Puntos actuales: " + puntos);
                    } else {
                        System.out.println("No tienes suficientes puntos para gastar (requieres al menos 15). Puntos actuales: " + puntos);
                    }
                    break;

                case 3:
                    System.out.println("Puntos actuales: " + puntos);
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intenta nuevamente.");
                    break;
            }

        } while (opc != 4); // El ciclo se repite hasta que la opción sea 4 (Salir)

        // Mostrar puntos restantes al terminar
        System.out.println("\nJuego terminado. Puntos totales restantes: " + puntos);
        
        teclado.close();
    }
}

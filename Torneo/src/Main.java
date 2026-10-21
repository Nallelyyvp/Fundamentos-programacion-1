import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);


        double puntos = 0;
        double promedio;
        double acumulado=0;
        int masDe1000 = 0;
        int menosDe1000 = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.println("Ingresa puntuacion de la partida " + i + ":");
            puntos = teclado.nextDouble();
            acumulado += puntos;

            if(puntos>1000){
                masDe1000++;
            }else {
                menosDe1000++;
            }

        }
        promedio=acumulado/7;
        System.out.println("Puntos acumulados " + acumulado);
        System.out.println("Promedio de puntuacion " + promedio);
        System.out.println("Partidas con mas 1000 puntos " + masDe1000);
        System.out.println("Partidas con 1000 puntos o menos " + menosDe1000);





    }
}

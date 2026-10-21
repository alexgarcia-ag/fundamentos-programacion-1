import java.util.Scanner;
public class Torneo_de_Videojuegos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int totalPartidas=7;
        int puntosAcumulados=0;
        int partidasMasde1000=0;
        int partidascon1000omenos=0;
        for (int i=1; i <= totalPartidas; i++) {
            System.out.println("Ingrese la puntuacion de su partida"+i+":");
            int puntosObtenidos= scanner.nextInt();

            puntosAcumulados+=puntosObtenidos;
            if (puntosObtenidos > 1000) {
                partidasMasde1000++;
            } else {
                partidascon1000omenos++;
            }
        }
        double promedio=(double) puntosAcumulados/totalPartidas;
        System.out.println("Puntos acumulados:"+puntosAcumulados);
        System.out.println("Promedio de puntuacion:"+promedio);
        System.out.println("Partidas con mas de 1000 puntos:"+partidasMasde1000);
        System.out.println("Partidas con menos de 1000 puntos o menos:"+partidascon1000omenos);

        System.out.println();
    }
}


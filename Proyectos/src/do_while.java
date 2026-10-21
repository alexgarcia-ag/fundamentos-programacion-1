import java.util.Scanner;
public class do_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int puntos=100;
        int opc;
        do{ // Menu
            System.out.println("Ingresa la opcion deseada");
            System.out.println("1. Ganar 20 puntos");
            System.out.println("2. Gastar 15 puntos");
            System.out.println("3. Consultar puntos");
            System.out.println("4. Salir");
            opc= scanner.nextInt();

            switch (opc) { // Opciones a elegir
                case 1:
                    puntos += 20;
                    System.out.println("Has ganado 20 puntos! Puntos actuales:"+puntos);
                    break;
                case 2:
                    if (puntos >=  15) {
                        puntos -= 15;
                        System.out.println("Has gastado 15 puntos! Puntos actuales:" + puntos);
                    } else {
                        System.out.println("No tienes puntos suficientes para gastar! Puntos actuales" + puntos);
                    }
                        break;
                case 3:
                    System.out.println("Tus puntos actuales son:" + puntos);
                    break;
                case 4:
                    System.out.println("Saliste del juego");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    }

            System.out.println();// Espacio
        }while (opc!=4);
        System.out.println("Juego finalizado... Tus puntos finales son:" + puntos);
    }
}

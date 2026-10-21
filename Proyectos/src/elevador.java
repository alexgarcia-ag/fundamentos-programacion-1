import java.util.Scanner;
public class elevador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Piso Actual:");
        int pisoActual = scanner.nextInt();
        while (pisoActual <= 0) {
            System.out.println("Error. Ingrese un piso valido:");
            pisoActual = scanner.nextInt();
        }

        System.out.println("Piso al que desea ir:");
        int pisoDestino = scanner.nextInt();
        while (pisoDestino <= 0 || pisoDestino == pisoActual) {
            System.out.println("Error. Ingrese piso destino valido:");
            pisoDestino = scanner.nextInt();
        }

        System.out.println("Resultado:");
        if (pisoActual < pisoDestino) {

            int piso = pisoActual + 1;
            while (piso < pisoDestino) {
                System.out.print(piso + ",");
                piso = piso + 1;
            }
            System.out.println(pisoDestino);
        } else {

            int piso = pisoActual - 1;
            while (piso > pisoDestino) {
                System.out.print(piso + ",");
                piso = piso - 1;
            }
            System.out.println(pisoDestino);
        }
    }
}
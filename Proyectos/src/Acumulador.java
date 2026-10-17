import java.util.Scanner;

public class Acumulador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el porcentaje de bateria del Dron:");
        int bateria = scanner.nextInt();
        int consumo = 7;
        int minuto = 1;
        while (bateria >= consumo) {
            bateria -= consumo;
            System.out.println("Minuto:" + minuto + "->bateria\n" + bateria + "%");
            minuto++;


        }
    }
}


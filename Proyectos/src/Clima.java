import java.util.Scanner;
public class Clima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en C: ");
        double temperatura = scanner.nextDouble();
        if (temperatura < 10) {
            System.out.println("Frio extremo");
        } else if (temperatura <= 20) {
            System.out.println("Clima fresco");
        } else if (temperatura <= 30) {
            System.out.println("Clima agradable");
        } else {
            System.out.println("Calor extremo");
        }
    }
}

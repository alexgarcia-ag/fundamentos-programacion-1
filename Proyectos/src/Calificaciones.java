import java.util.Scanner;
public class Calificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el promedio del alumno: ");
        double promedio = scanner.nextDouble();
        System.out.print("Ingrese el porcentaje de asistencia (0-100): ");
        double asistencia = scanner.nextDouble();

        if (promedio < 7.0) {
            System.out.println("Reprobado por calificación");
        } else if (asistencia < 80.0) {
            System.out.println("Reprobado por faltas");
        } else {
            System.out.println("Aprobado regular");
        }
    }
}

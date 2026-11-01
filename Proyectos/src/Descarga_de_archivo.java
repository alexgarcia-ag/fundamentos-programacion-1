import java.util.Scanner;
public class Descarga_de_archivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Tiempo de Descarga ===");

        // El usuario introduce los datos requeridos
        System.out.print("Introduce el tamaño del archivo en MB:");
        double magnitud = scanner.nextDouble();

        System.out.print("Introduce la velocidad de descarga en MB por segundo: ");
        double velocidad = scanner.nextDouble();

        // Aplicacion de reglas de validacion
        if (magnitud < 0) {
            System.out.println("Error: El tamaño del archivo no puede ser negativo.");
        } else if (velocidad <= 0) {
            System.out.println("Error: La velocidad de descarga debe ser mayor que cero.");
        } else {
            // Llamar al metodo desde main y mostrar el resultado
            double tiempo = calcularTiempo(magnitud, velocidad);
            System.out.println("El tiempo estimado de descarga es:"+tiempo+"segundos.");
        }
    }
    // Metodo para calcular el tiempo: recibe los parametros y calcula dividiendo, devuelve el resultado con return
    static double calcularTiempo(double magnitud, double velocidad) {
        return magnitud/velocidad;
    }
}


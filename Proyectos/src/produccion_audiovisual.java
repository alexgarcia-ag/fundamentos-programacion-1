import java.util.Scanner;
public class produccion_audiovisual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Alquiler de Cámaras ===");

        // El usuario introduce datos requeridos
        System.out.print("Introduce la tarifa de alquiler por hora: ");
        double tarifa = scanner.nextDouble();

        System.out.print("Introduce la cantidad de horas de uso: ");
        double horas = scanner.nextDouble();

        // Aplicacion de las reglas de validacion
        if (tarifa <= 0) {
            System.out.println("Error: La tarifa debe ser mayor que cero.");
        } else if (horas <= 0) {
            System.out.println("Error: Las horas deben ser mayores que cero.");
        } else {
            // Desde main se capturan los datos y se llama a ambos metodos pero por separado
            double total = calcularRenta(tarifa, horas);
            mostrarComprobante(total);
        }
    }

    // Metodo para calcular Renta: recibe la tarifa y las horas, y devuelve el total multiplicandolas
    static double calcularRenta(double tarifa, double horas) {
        return tarifa*horas;
    }

    // Metodo void llamado mostrarComprobante: recibe el total y lo muestra
    static void mostrarComprobante(double total) {
        System.out.println("\n----------------------------------");
        System.out.println("COMPROBANTE DE PAGO");
        System.out.println("El total que deberá pagar el cliente es:$"+total);
        System.out.println("----------------------------------");
    }
    }


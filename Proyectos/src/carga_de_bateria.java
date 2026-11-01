import java.util.Scanner;
public class carga_de_bateria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opc;
        System.out.println("=== Carga de Batería ===");
        // Utilizar do para varias simulaciones
        do {
            System.out.print("\nIntroduce el porcentaje inicial de batería (0 a 100): ");
            int porcentaje = scanner.nextInt();

            // Validar la informacion: El porcentaje inicial debe estar entre 0 y 100
            if (porcentaje < 0 || porcentaje > 100) {
                System.out.println("Error: El porcentaje inicial debe estar entre 0 y 100.");
            } else {
                // Desde main se captura el porcentaje, valida y muestra el resultado
                int minutos = calcularMinutos(porcentaje);
                System.out.println("Minutos necesarios para completar la carga:"+minutos+" minutos.");
            }

            System.out.print("¿Deseas realizar otra simulación? (1. Si / 2. No): ");
            opc = scanner.nextInt();

        } while (opc == 1); // El usuario puede realizar varias simulaciones hasta que lo termine
    }

    // Crear un metodo llamado calcularMinutos que recibe el porcentaje inicial
    static int calcularMinutos(int porcentaje) {
        int minutos = 0;

        // Si la bateria ya está al 100%, no necesita ningún minuto de carga
        // Utilizar un ciclo para simular la carga hasta llegar al 100%
        while (porcentaje < 100) {
            porcentaje += 8; // Cada minuto conectado recupera 8 puntos porcentuales

            // La bateria nunca puede superar el 100%
            if (porcentaje > 100) {
                porcentaje = 100;
            }
            minutos++;
        }
        // Debe devolver mediante return los minutos necesarios
        return minutos;
    }
}


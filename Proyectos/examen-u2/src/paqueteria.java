import java.util.Scanner;
public class paqueteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== PAQUETERIA ===");
        //Registro de paquete
        System.out.println("Ingresa el peso del paquete (kg) (0 para salir): ");
        double peso = scanner.nextDouble();
        int tipoEnvio;
        do { // Menu
            System.out.println("Ingresa el tipo de envio");
            System.out.println("1. Local");
            System.out.println("2. Nacional");
            System.out.println("3. Express");
            System.out.println("0. Salir");
            tipoEnvio = scanner.nextInt();

            switch (tipoEnvio) { // Restricciones de peso
                case 1:
                    if (peso <= 12) {
                        System.out.println("Paquete Aceptado");
                        double CalculoEnvio = 30 + 8 * peso;
                        System.out.println("Paquete fragil? (1. Si / 2. No)");
                        int paqueteFragil= scanner.nextInt();
                        double total = CalculoEnvio;
                    } else {
                        System.out.println("Paquete Rechazado");
                        break;
                        case 2:
                            if (peso <= 20) {
                                System.out.println("Paquete Aceptado");
                                double CalculoEnvio = 50 + 12 * peso;
                                System.out.println("Paquete fragil? (1. Si / 2. No)");
                                int paqueteFragil= scanner.nextInt();
                                double total = CalculoEnvio;
                            } else {
                                System.out.println("Paquete Rechazado");
                            }
                            break;
                        case 3:
                            if (peso <= 5) {
                                System.out.println("Paquete Aceptado");
                                double CalculoEnvio = 80 + 20 * peso;
                                System.out.println("Paquete fragil? (1. Si / 2. No)");
                                int paqueteFragil= scanner.nextInt();
                                double total = CalculoEnvio;
                            } else {
                                System.out.println("Paquete Rechazado");
                            }
                        case 4:
                            System.out.println("Saliste del programa");
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }

                    System.out.println();// Espacio
            }
            while (opc != 4) ;
            System.out.println("Programa finalizado");
            System.out.println("Total de paquetes aceptados:"+Aceptados);
        }
    }
}




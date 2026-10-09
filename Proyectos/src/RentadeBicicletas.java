import java.util.Scanner;
    public class RentadeBicicletas {
        public static void main(String[] args) {
            Scanner tc = new Scanner(System.in);
            System.out.print("Ingrese el tipo de bicicleta (1: Bicicleta urbana, 2: Bicicleta de montaña, 3: Bicicleta electrica): ");
                int tipoBicicleta = tc.nextInt();
                int tarifaPorHora = 0;
                String bicicleta = "";
                switch (tipoBicicleta) {
                    case 1:
                        bicicleta = "Bicicleta Urbana";
                        tarifaPorHora = 40;
                        break;
                    case 2:
                        bicicleta = "Bicicleta de Montaña";
                        tarifaPorHora = 60;
                        break;
                    case 3:
                        bicicleta = "Bicicleta Eléctrica";
                        tarifaPorHora = 90;
                        break;
                    default:
                        System.out.println("Opcion no valida.");
                        break;
                }
                if (tarifaPorHora > 0) {
                    System.out.print("Ingrese la cantidad de horas que desea usar la bicicleta: ");
                    int horas = tc.nextInt();
                    if (horas > 0) {
                        System.out.print("¿Cuenta con membresía? (true/false): ");
                        boolean membresia = tc.nextBoolean();
                        double subtotal = tarifaPorHora * horas;
                        double descuento = 0.00;
                        if (membresia) {
                            descuento = subtotal * 0.20;
                        }
                        double total = subtotal - descuento;
                        System.out.println("Su tipo de bicicleta es: " + bicicleta);
                        System.out.println("El subtotal es: $" + subtotal);
                        System.out.println("Su descuento es de: $" + descuento);
                        System.out.println("El total a pagar es: $" + total);
                    } else {
                        System.out.println("No cumple con la cantidad de horas requeridas");
                    }
                }

            }
        }


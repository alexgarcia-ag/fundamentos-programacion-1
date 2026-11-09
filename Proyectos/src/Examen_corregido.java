import java.util.Scanner;
public class Examen_corregido {
public static void main(String[] args) {
       Scanner tc = new Scanner(System.in);
        System.out.println("=======Paqueteria=======");
        int paquetes = 0;
        int paquetesr =0;
        int paquetesf = 0;
        int peso;
        int total;
        int costototal=0;
        int opc2;

        while (true){
            System.out.println("------------------------"); //Menu
            System.out.println("Seleccione una de las siguientes opciones:");
            System.out.println("1. Local (Peso lim. 12 kg)");
            System.out.println("2. Nacional (Peso lim. 20 kg)");
            System.out.println("3. Express (Peso lim. 5)");
            System.out.println("4. Salir");
            int opc = tc.nextInt();

            if (opc == 4) {
                System.out.println("No se registro el envio de un paquete");
                break;
            }

            switch (opc) {
                case 1:
                    System.out.println("Seleccionaste un envio Local");
                    break;
                case 2:
                    System.out.println("Seleccionaste un envio Nacional");
                    break;
                case 3:
                    System.out.println("Seleccionaste un envio Express");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    continue;
            }

            System.out.println("---------------------");
            System.out.println("Ingrese el peso del paquete para registrarlo");
            peso = tc.nextInt();


            if (peso < 0) {
                System.out.println("Dato invalido");
            } else {

                switch (opc) {
                    case 1:
                        if (peso > 12) {
                            paquetesr++;
                            System.out.println("El peso del paquete excede el limite");
                            break;
                        } else if (peso <= 12 ) {
                            System.out.println("Seleccionaste envio Local.");
                            System.out.println("El paquete es fragil? 1. Si / 2. No");
                            opc2 = tc.nextInt();

                            switch (opc2) {
                                case 1:
                                    paquetes++;
                                    paquetesf++;
                                    total = 30 + (8 * peso) + 25;
                                    costototal = costototal + total;
                                    System.out.println("Total a pagar: " + total);
                                    break;

                                case 2:
                                    paquetes++;
                                    total = 30 + (8 * peso);
                                    costototal = costototal + total;
                                    System.out.println("Total a pagar: " + total);
                            }
                            break;
                        }
                    case 2:
                        if (peso > 20) {
                            paquetesr++;
                            System.out.println("El peso del paquete excede el limite");
                            break;
                        } else if (peso <= 20 ) {
                            System.out.println("Seleccionaste envio Nacional.");
                            System.out.println("El paquete es fragil? 1. Si / 2. No");
                            opc2 = tc.nextInt();

                            switch (opc2){
                                case 1:
                                    paquetes++;
                                    paquetesf++;
                                    total=50 + (12*peso) + 25;
                                    costototal=costototal + total;
                                    System.out.println("Total a pagar: "+total);
                                    break;

                                case 2:
                                    paquetes++;
                                    total=50 + (12*peso) ;
                                    costototal=costototal + total;
                                    System.out.println("Total a pagar: "+total);
                                    break;
                            }

                        }
                    break;

                    case 3:
                        if (peso > 5) {
                            paquetesr++;
                            System.out.println("El peso del paquete excede el limite");
                            break;
                        } else if (peso <= 5){
                            System.out.println("Seleccionaste envio Express.");
                            System.out.println("El paquete es fragil? 1. Si / 2. No");
                            opc2 = tc.nextInt();

                            switch (opc2) {
                                case 1:
                                    paquetes++;
                                    paquetesf++;
                                    total = 80 + (20 * peso) + 25;
                                    costototal = costototal + total;
                                    System.out.println("Total a pagar: " + total);
                                    break;

                                case 2:
                                    paquetes++;
                                    total = 80 + (20 * peso);
                                    costototal = costototal + total;
                                    System.out.println("Total a pagar: " + total);
                            }
                            break;

                        }
                    break;

                    default:
                        System.out.println("Opcion invalida");
                    break;
                }
            }
        }



        System.out.println(" ");
        System.out.println("--------------------------");
        System.out.println(" ");
        System.out.println("Total de paquetes aceptados: "+paquetes);
        System.out.println("Total de paquetes rechazados: "+paquetesr);
        System.out.println("Total de paquetes fragiles: "+paquetesf);
        System.out.println("El total a pagar por los "+paquetes+" paquetes enviados es de: "+costototal);


//Cierre del programa
}
}

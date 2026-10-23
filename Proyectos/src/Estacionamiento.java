import java.util.Scanner;
public class Estacionamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int totalAutos = 0;
        double totalFinal = 0;
        int autosconDescuento = 0;
        System.out.println("Ingrese la cantidad de horas que lleva estacionado su vehiculo (0 para finalizar):");
        int horas = scanner.nextInt();
        while (horas!=0) {
            if (horas<0) {
                System.out.println("Error: No se permiten horas negativas. Intente de nuevo.");
            } else {
                totalAutos++;
                double pago=horas*15;
                // Descuento fijo de $10 por permanecer mas de 5 horas
                if (horas>5) {
                    pago-=10;
                    autosconDescuento++;
                }
                totalFinal+=pago;
                System.out.println("El automóvil pagará: $"+pago);
                System.out.println();
            }
            System.out.print("Ingrese la cantidad de horas estacionado (0 para terminar):");
            horas = scanner.nextInt();
        }
        System.out.println("\n Resumen:");
        System.out.println("Total de automóviles atendidos:\n"+totalAutos);
        System.out.println("Total de dinero recaudado:\n6" +
                "$"+totalFinal);
        System.out.println("Cantidad de automóviles que recibieron descuento:\n"+autosconDescuento);
        if (totalAutos>0) {
            double promedioPagado=totalFinal/totalAutos;
            System.out.println("Promedio pagado por automóvil: \n$" +promedioPagado);
        } else {
            System.out.println("Promedio pagado por automóvil: $0.0");
        }
    }
}

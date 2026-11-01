import java.util.Scanner;
public class Envio_de_paquetes {
    public static void main(String[] args) {
        System.out.println("=== Mensajeria ==="); //Bienvenida

        //Llamada al metodo con el primer paquete = argumentos
        mostrarEtiqueta("MX-1078", "Veracruz", 8.57);

        //Llamada al metodo con el segundo paquete = argumentos
        mostrarEtiqueta("MX-1756", "Morelia", 65.78);
    }
    //Metodo void que recibe parámetros; el número de guia, destino y el peso.
    static void mostrarEtiqueta(String numeroGuia, String ciudadDestino, double peso) {
        System.out.println("\n----------------------------------");
        System.out.println("ETIQUETA DE ENVIO");
        System.out.println("Numero de Guia:"+numeroGuia);
        System.out.println("Ciudad Destino:"+ciudadDestino);
        System.out.println("Peso:"+peso+" kg");
        System.out.println("----------------------------------");
    }
}


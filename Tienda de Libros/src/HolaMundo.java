
import java.util.Scanner;

public class HolaMundo {

    public static void main(String args[]) {
        
        Scanner scaner = new Scanner(System.in);
        System.out.println("Proporciona el nombre: ");
        String nombre = scaner.nextLine();
        System.out.println("Proporciona el ID: ");
        int id = Integer.parseInt(scaner.nextLine());
        System.out.println("Proporciona el precio: ");
        double precio = Double.parseDouble(scaner.nextLine());
        System.out.println("Proporciona envio (True o False): ");
        boolean envio = Boolean.parseBoolean(scaner.nextLine());
        
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio gratuito: " + envio);
        
    }
    
}

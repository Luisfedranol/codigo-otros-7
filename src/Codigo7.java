import java.util.HashMap;
import java.util.Scanner;

public class Codigo7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // Inicializar Scanner para leer entradas

        HashMap<String, String> capitales = new HashMap<>(); // Se cambia HashMap<Byte, Double> por HashMap<String, String> y se corrige el nombre de la variable
 
        capitales.put("Canadá", "Ottawa");
        capitales.put("Estados Unidos", "Washington DC");
        capitales.put("México", "Ciudad de México"); //Se corrige capital
        capitales.put("Belice", "Belmopán");
        capitales.put("Costa Rica", "San José");
        capitales.put("El Salvador", "San Salvador"); //Se agrega capital
        capitales.put("Guatemala", "Ciudad de Guatemala");
        capitales.put("Honduras", "Tegucigalpa");
        capitales.put("Nicaragua", "Managua");
        capitales.put("Panamá", "Ciudad de Panamá");//Se corrige capital

        String c = "";
        
        do {
            System.out.print("Escribe el nombre de un país y te diré su capital (o escribe 'salir' para terminar): "); //Se agrega instrucción para salir
            c = s.nextLine(); // Se cambia nextDouble() por nextLine()

            if (!c.equals("salir")) { // Se corrige equal por equals
                if (capitales.containsKey(c)) {// Comprobar si el país está en el HashMap con el método containsKey()
                    System.out.println("La capital de " + c + " es " + capitales.get(c)); // Mostrar la capital y el país en una sola línea. Se cambia el métoto put() por get()
                } else {
                    System.out.print("No conozco la respuesta. ¿Cuál es la capital de " + c + "?: "); //Se muestra mensaje en una sola línea
                    String nuevaCapital = s.nextLine(); // Leer la capital proporcionada por el usuario. Se cambia el nombre de la variable a nuevaCapital
                    capitales.put(c, nuevaCapital); // Se corrigen nombres de las variables
                    System.out.println("Gracias por enseñarme nuevas capitales");
                }//else
            }//if
        } while (!c.equals("salir"));
        s.close(); // Cerrar el Scanner
	}//main
}//class Codigo7

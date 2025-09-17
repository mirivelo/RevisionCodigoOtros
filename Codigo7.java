
import java.util.HashMap;
import java.util.Scanner;

public class Codigo7 {

	public static void main (String[] args) {
	
		// 1. Se crea objeto para recibir la entrada
		Scanner scanner = new Scanner(System.in);
		// 2. El HashMap debe ser tipo string
		HashMap<String, String> capitales = new HashMap<>();
		// 3. HashMap con países y capitales
		capitales.put("Canadá", "Otawwa");
		capitales.put("Estados Unidos", "Washington DC");
		capitales.put("México", "México DF");
		capitales.put("Belice", "Belmopán");
		capitales.put("Costa Rica", "San José");
		capitales.put("El Salvador", "San Salvador");
		capitales.put("Guatemala", "Ciudad de Guatemala");
		capitales.put("Honduras", "Tegucigalpa");
		capitales.put("Nicaragua", "Managua");
		capitales.put("Panamá", "Panamá");
		// 4. Bucle DoWhile para interactuar con el usuario
		String pais;
		do {
			System.out.println("");
			System.out.println("-------------------------------------------------------");
			System.out.println("Escribe el nombre de un País para saber su capital o 'salir' para terminar: ");
			pais =scanner.nextLine();
			// Lógica if para manejar la entrada 
			if(!pais.equalsIgnoreCase("salir")) {
				if(capitales.containsKey(pais)) {
			// Si el país está en el mapa, se imprime con su capital
					System.out.println("La capital de [ "+pais+" ] es [ " +capitales.get(pais)+ " ]. ");
					
				}else {
			// Si el país no esta en el HashMap, se ofrese al usuario agregar una nueva capital
					System.out.println("No conozco la respuesta para ese país, ¿Cuál es la capital de [ "+pais+" ] ?");
					String nCapital=scanner.nextLine();
					capitales.put(pais, nCapital);
					System.out.println("Gracias por enseñarme una nueva capital! ");
				}
			}
		}while(!pais.equalsIgnoreCase("salir"));
		
		System.out.println("Hasta luego!");
		scanner.close();
	}//Main
	
}//Class Codigo7

package codigoOtros6;

import java.util.Random;
import java.util.Scanner;

public class codigo6 {

	 public static void main(String[] args) {
		 
	    // 1. inicialización del array
		int[] n = new int[20];
		Random rand = new Random();
		// 2. Generar números aleatorios para mostrarlos dentro del array
	    System.out.println("Entrada Original: ");
		for (int i = 0; i < n.length; i++) {
			// Genera números aleatorios entre 0 - 380, le sumas 20 para 
			//que el rango sea de 20 - 400 al final
	      n[i] = rand.nextInt(380) + 20;
	      System.out.println(n[i] + " ");
	    }
	    // 3. Se agrega salto de linea y se separa la impresión del array de la pregunta
		System.out.println();
		System.out.println("------------------------------------------");
		// 4. Solicita qué múltiplos quiere resaltar 
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n¿Qué números quiere resaltar? ");
	    System.out.println(" 1 – los múltiplos de 5:    ó    2 – los múltiplos de 7: ");
	    int opcion = scanner.nextInt(); 
	    // 5. Según la opción, si es 1 o no determina que múltiplo a buscar 
	    int multiplo = (opcion == 1) ? 5 : 7;
	    // 6. Recorre el array y resalta los múltiplos
	    System.out.println("\nArray con múltiplos de [ "+multiplo+" ] resalrados");
	    for(int e : n) {
	    	// Si el número es múltiplo se imprime en corchetes 
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      }else {
	    	  // Si no es múltiplo no se resalta.
	        System.out.print(e + " ");
	      }//Else
	    }//For
	  // 7. Cierra Scanner para evitar uso de recursos
	    scanner.close();
	}
}

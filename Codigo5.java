/* 
 * Objetivo regresar si el número es afortunado o no, 
 *  Un número es afortunado si la cantidad de dígitos 3, 7, 8 y 9 
 *  que contiene es mayor que la cantidad de los demás dígitos.
 * 
 * Se corrigió uso incorrecto de String a int.
 * Se añadieron comentarios para explicar las partes clave del código.
 * Se implementó un manejo de errores para entradas no numéricas.
 */

//import Scanner
import java.util.Scanner;

public class Codigo5 {

	 public class static void main(String[] args) {
		//crea un objeto para obtener la entrada del usuario 
		Scanner entrada = new Scanner(System.in); 
		//Imprime un mensaje en la consola para solicitar al usuario un número
		System.out.print("Introduzca un número: ");
		//Lee la línea de texto compreta que el usuario ingresa y la guarda en la variable números
		String numeros = entrada.nextLine();
		//Guarda la entrada original para mostrarla después
		String c = numeros;
		//Inicia bloque try catch para intentar ejecutar el código 
		try {
			// Convierte la cadena de ' numeros' a tipo long
			long numero = Long.parseLong(numeros);
			// Contador para números afortunados
			int afortunado = 0;
			// Contador para números no afortunados
			int noAfortunado = 0;
			// Inicializa el bucle para cada dígito
			do {
				// Obtiene el último dígito del número usando el operador %
				long n = numero % 10;
				// Comprueba so el dígito es 3, 7, 8 o 9
				if (n == 3 || n == 7 || n == 8 || n == 9) {
					// Si es afortunado, incrementa el contador de dígitos afortunados
					afortunado++;
				}else {
					// Si no es afortunado, incrementa el contador de otros dígitos.
					noAfortunado++;
				}
	             // Elimina el último dígito del número dividiéndolo por 10
				numero /= 10;
				// El bucle continúa mientras el número sea diferente de 0.
			} while (numero != 0);

	         // Comprueba si la cantidad de dígitos afortunados es mayor que la de los otros.
			if (afortunado > noAfortunado) {
	             // Si es así, imprime un mensaje indicando que el número es afortunado.
				System.out.println("El número [ " + c + " ] es un número afortunado");
			} else {
	             // Si no, imprime un mensaje indicando que el número no es afortunado.
				System.out.println("El número [ " + c + " ] no es un número afortunado");
			}
		// Captura cualquier 'NumberFormatException' que ocurra en el bloque 'try'.
		} catch (NumberFormatException e) {
	         // Si el usuario ingresa algo que no es un número, se ejecuta este código y se imprime un mensaje de error.

			System.out.println("[ " + c + " ] Entarda invalida. Ingrese un número");
		}
	     // Cierra el objeto Scanner para liberar los recursos del sistema.

		entrada.close();
	}
}// ClassMain
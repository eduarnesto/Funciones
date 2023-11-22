package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		//Variable para la letra escrita
		String letra;
		
		//Variable para saber si es vocal o no
		boolean vocal;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto por la letra
		System.out.println("Escribe una letra");
		
		//Leo del teclado
		letra = sc.nextLine();
		
		//Llamo a la funcion para saber si es una vocal
		vocal=Vocal.vocal(letra);
		
		//Muestro si es vocal
		if(vocal) {
			System.out.println("La letra introducida es una vocal");
		} else {
			System.out.println("La letra introducida no es una vocal");
		}
		
		//Cierro el Scanner
		sc.close();
	}

}

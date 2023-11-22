package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		//Variable para el numero
		int num;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto por el primer número
		System.out.println("Introduzca el número");
		
		//Leo del teclado
		num=sc.nextInt();
		
		//Llamo a la función
		Tabla.tabla(num);

		//Cierro el Scanner
		sc.close();
	}

}

package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		//Variable para los dos números
		int num1, num2;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto por el primer número
		System.out.println("Introduzca el primer número");
		
		//Leo del teclado
		num1=sc.nextInt();
		
		//Pregunto por el segundo número
		System.out.println("Introduzca el segundo número");
		
		//Leo del teclado
		num2=sc.nextInt();
		
		//Llamo a la función
		Enteros.enteros(num1, num2);
		
		//Cierro el Scanner
		sc.close();

	}

}

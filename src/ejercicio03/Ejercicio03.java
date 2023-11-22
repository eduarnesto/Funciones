package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		//Variable para los dos números y el mayor
		int num1, num2, mayor;
		
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
		
		//Compruebo cual es el mayor
		mayor=Maximo.maximo(num1, num2);
		
		//Muestro el número mayor
		System.out.println("El número mayor es: " + mayor);
		
		//Cierro el Scanner
		sc.close();
	}

}

package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		//Variable para el numero y la cantidad de divisores primos que hay
		int num, primos;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto por el primer número
		System.out.println("Introduzca el número");
		
		//Leo del teclado
		num=sc.nextInt();
		
		//LLamo a la función
		primos=DivisoresPrimos.divisores(num);
		
		//Muestro la cantidad de primos divisores que tiene el número
		System.out.println("Hay " + primos + " números primos divisores del número");
		
		//Cierro el Scanner
		sc.close();
	}

}

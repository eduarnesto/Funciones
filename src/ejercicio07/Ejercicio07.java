package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		//Variable para el numero
		int num;
		
		//Variable para saber si es primo
		boolean primo;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto por el primer número
		System.out.println("Introduzca el número");
		
		//Leo del teclado
		num=sc.nextInt();
		
		//Llamo a la función
		primo=Primo.primo(num);
		
		//Muestro si es primo
		if(primo) {
			System.out.println("Es primo");
		} else {
			System.out.println("No es primo");
		}
		
		//Cierro el Scanner
		sc.close();
	}

}

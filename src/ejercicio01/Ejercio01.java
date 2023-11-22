package ejercicio01;

import java.util.Scanner;

public class Ejercio01 {

	public static void main(String[] args) {
		//Variable para guardar el número
		int num;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto por el número de veces que se debe de repetir eco
		System.out.println("¿Cuátas veces debe repetirse eco?");
		
		//Leo del teclado
		num=sc.nextInt();
		
		//Llamo a la función
		Eco.eco(num);
		
		//Cierro el Scanner
		sc.close();

	}

}

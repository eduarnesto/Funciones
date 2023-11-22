package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		//Variable para la opcion, el radio y la altura
		int opcion, radio, altura;
		
		//Varibale para el resultado
		double res;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto por la radio
		System.out.println("Introduzca la radio del cilindro");
		
		//Leo del teclado
		radio=sc.nextInt();
		
		//Pregunto por la altura
		System.out.println("Introduzca la altura del cilindro");
		
		//Leo del teclado
		altura=sc.nextInt();
		
		//Pregunto que operación quiere realizar
		System.out.println("Introduce 1 para calcular el área");
		System.out.println("Introduce 2 para calcular el vloumen");
		
		//Leo del teclado
		opcion=sc.nextInt();
		
		//Llamo a la función correspondiente
		if(opcion==1) {
			res=Area.area(altura, radio);
			System.out.println("El área del cilindor es " + res);
		} else {
			res=Volumen.volumen(altura, radio);
			System.out.println("El volumen del cilindro es " + res);
		}
		
		//Cierro el Scanner
		sc.close();
	}

}

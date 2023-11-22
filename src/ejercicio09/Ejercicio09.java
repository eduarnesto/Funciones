package ejercicio09;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		//Variable para los dos números y el resultado
		float num1, num2, res;
		
		//Variable para la opcion
		int opcion;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto por el primer número
		System.out.println("Introduzca el primer número");
		
		//Leo del teclado
		num1=sc.nextFloat();
		
		//Pregunto por el segundo número
		System.out.println("Introduzca el segundo número");
		
		//Leo del teclado
		num2=sc.nextFloat();
		
		//Pregunto que operación quiere realizar
		System.out.println("Introduzca 1 para sumar");
		System.out.println("Introduzca 2 para restar");
		System.out.println("Introduzca 3 para multiplicar");
		System.out.println("Introduzca 4 para dividir");
		
		//Leo del teclado
		opcion=sc.nextInt();
		
		//Llamo a la función correspondiente
		res=switch (opcion) {
		case 1->
			Operaciones.sumar(num1, num2);
		
		case 2->
			Operaciones.restar(num1, num2);
		
		case 3->
			Operaciones.multiplicar(num1, num2);
		
		case 4->
			Operaciones.dividir(num1, num2);
		
		default -> 0;
		};//Fin del switch
		
		//Muestro el resultado de la operación
		System.out.println("El resultado de la operación es " + res);
		
		//Cierro el Scanner
		sc.close();
	}

}

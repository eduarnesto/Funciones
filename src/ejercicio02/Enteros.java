package ejercicio02;

public class Enteros {
	public static void enteros(int num1, int num2) {
		int aux;
		if(num2>num1) {
			aux=num1;
			num1=num2;
			num2=aux;
		}
		for(int i=num2+1; i<num1; i++) {
			System.out.println(i);
		}
	}
}

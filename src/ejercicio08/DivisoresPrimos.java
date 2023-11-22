package ejercicio08;

import ejercicio07.Primo;

public class DivisoresPrimos {
	public static int divisores(int num) {
		int divisoresPrimos=0;
		for(int i=2; i<=num; i++) {
			if(Primo.primo(i)) {
				if(num%i==0) {
					divisoresPrimos++;
				}
			}
		}
		return divisoresPrimos;
	}
}

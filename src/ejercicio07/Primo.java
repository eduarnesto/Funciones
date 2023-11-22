package ejercicio07;

public class Primo {

	public static boolean primo(int num) {
		boolean primo=true;
		for(int i=2; i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				primo=false;
				break;
			}
		}
		return primo;
	}

}

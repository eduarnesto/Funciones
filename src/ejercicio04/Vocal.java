package ejercicio04;

public class Vocal {
	public static boolean vocal(String letra) {
		boolean vocal=false;
		switch (letra.toLowerCase()) {
		case "a", "e", "i", "o", "u"->{
			vocal=true;
		}
		}
		return vocal;
	}
}

package ejercicio06;

public class Area {
	public static double area(int altura, int radio) {
		double res;
		res=2*Math.PI*radio*(altura+radio);
		return res;
	}
}

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double f = temperatura(25);
		
		System.out.printf("Temperatura em Fahrenheit = %.2f", f);
		
		sc.close();
	}

	public static double temperatura(double c) {
		
		return (c * 9/5) + 32;
		
	}
	
}
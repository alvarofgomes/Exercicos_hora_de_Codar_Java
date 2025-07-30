import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quer converte para celsius ou fahrenheit(c/f): ");
		String letra = sc.nextLine();
		
		if(letra.equalsIgnoreCase("c")) {
			System.out.println("Digite a temperatura em celsius: ");
			double f = celsiusParaFahrenheit(sc.nextDouble());
			
			System.out.printf("A temperatura de celsius para fahrenheit é: %.2f", f);
			
		}else if(letra.equalsIgnoreCase("f")) {
			System.out.println("Digite a temperatura em fahrenheit: ");
			double c = fahrenheitParaCelsius(sc.nextDouble());
			
			System.out.printf("A temperatura de fahrenheit para celsius é: %.2f", c);
			
		}else {
			System.out.println("A opcão digitada está inválida. ");
		}
		
		sc.close();
	}

	public static double celsiusParaFahrenheit(double c) {
		return (c * 9 / 5) + 32;
	}
	
	public static double fahrenheitParaCelsius(double f) {
		return (f - 32) * 5 / 9;
	}
	
}
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		fatorial();
		
		
		sc.close();
	}

	public static void fatorial() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número para saber o fatorial: ");
		int fatorial = sc.nextInt();
		
		int result = fatorial;
		
		for (int i = 1; i < fatorial; i++) {
			result = result * i;
		}
		
		System.out.printf("O Fatorial do número %d é: %d",fatorial, result);
		
	}
	
}
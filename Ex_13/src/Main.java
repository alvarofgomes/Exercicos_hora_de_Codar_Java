import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número para saber o fatorial: ");
		int fatorial = sc.nextInt();
		
		System.out.printf("O Fatorial do número %d é: %d", fatorial, fatorial(fatorial));
		
		
		sc.close();
	}

	public static int fatorial(int f) {
		
		int result = f;
		
		for (int i = 1; i < f; i++) {
			result = result * i;
		}
		
		return result;
		
	}
	
}
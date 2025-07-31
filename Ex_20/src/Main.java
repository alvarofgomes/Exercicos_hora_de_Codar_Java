import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		numeroPrimo();
		
		sc.close();
	}
	
	
	public static void numeroPrimo() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int n = sc.nextInt();
		
		for(int i = n; i <= n; i++) {
			
			if(n <= 1) {
				System.out.println("Número Digitado não é primo. ");
			}else if(n == 2 || n == 3) {
				System.out.println("Número Digitado é primo. ");
			}else if(n % 2 != 0) {
				System.out.println("Número Digitado é primo. ");
			}else {
				System.out.println("Número Digitado não é primo. ");
			}
			
		}
		
		sc.close();
	}
	
}

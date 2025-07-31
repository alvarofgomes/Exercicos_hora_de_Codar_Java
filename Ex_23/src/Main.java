import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		contandorDeDigitos();
		
		sc.close();
	}
	
	public static void contandorDeDigitos() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n = sc.nextInt();
		
		String num = String.valueOf(n);
		System.out.println(num);
		while(n > 0) {
			
			num = String.valueOf(n);
			System.out.println("O número tem " +  num + " digitos "+ num.length());
			
			System.out.println("Digite um número: ");
			n = sc.nextInt();
		}
		
		sc.close();
	}

}

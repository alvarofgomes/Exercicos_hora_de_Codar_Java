import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n = numeroMaior(sc.nextInt());
		
		System.out.println(n);
		
		sc.close();
	}
	
	public static int numeroMaior(int n) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[4];
		int maior = n;
		
		for(int i = 0; i < num.length; i++) {
			System.out.println("Digite Um Numero: ");
			num[i] = sc.nextInt();
			
			if(num[i]> maior) {
				maior = num[i];
			}
			
		}
		
		return maior;
		
	}

}
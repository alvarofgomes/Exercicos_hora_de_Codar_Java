import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[5];
		
		System.out.println("Digite 5 números: ");
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Digite o " + (i+1) + "º número: ");
			numeros[i] = sc.nextInt();
		}
		
		System.out.print("Números digitados: " );
		for(int numero : numeros) {
			System.out.print(numero + " ");
		}
		
		System.out.println();
		System.out.print("Números digitados invertidos: " );
		for(int i = numeros.length - 1; i >= 0; i--) {
			System.out.print(numeros[i] + " ");
		}
		
		sc.close();
	}

}

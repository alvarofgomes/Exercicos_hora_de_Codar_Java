import java.util.*;

public class Ex_3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> n = new ArrayList<>();
		
		for(int i = 0; i < 5; i++){
			System.out.println("Digite o " + (i + 1) + "º número: ");
			n.add(sc.nextInt());
		}
		int soma = 0;
		for(int numero : n) {
			soma += numero;
		}
		
		System.out.println("Soma de números = " + soma);
		
		sc.close();
	}

}
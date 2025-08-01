import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int[] vet = new int[5];
		
		for(int i = 0; i < vet.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º Números: ");
			vet[i] = sc.nextInt();
		}
		System.out.println("Números com duplicidade: ");
		for(int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
		
		List<Integer> semDuplicados = new ArrayList<>();
		
		System.out.println("Números sem duplicidade: ");
		
		for(int i = 0; i < vet.length; i++) {
			if(!semDuplicados.contains(vet[i])) {
				semDuplicados.add(vet[i]);
			}
		}
		
		for(int dup : semDuplicados) {
			System.out.println(dup);
		}
		
		sc.close();
	}

}

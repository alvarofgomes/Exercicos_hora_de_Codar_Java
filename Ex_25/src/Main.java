import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos números você vai digitar: ");
		int[] vet = new int[sc.nextInt()];
	
		int maisFrequente = vet[0];
		
		int maxContagem = 1;
		
		for(int i = 0; i < vet.length; i++) {
			
			int contagem = 0;
			
			System.out.println("Digite o " + (i+1) + "º número");
			vet[i] = sc.nextInt();
			
			for(int j = 0; j < vet.length; j++) {
				if(vet[j] == vet[i]){
					contagem++;
				}
			}
			
			if(contagem > maxContagem) {
				maxContagem = contagem;
				maisFrequente = vet[i];
			}
			
		}
		
		
		
		System.out.println("O mais frequente é: " + maisFrequente);
		
		sc.close();
	}

}

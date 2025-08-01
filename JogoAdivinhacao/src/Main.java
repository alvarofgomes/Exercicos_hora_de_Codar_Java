import java.util.*;
public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();
		int numeroAleatorio = rand.nextInt(100) + 1;
		int numeroUsuario = 0;
		
		System.out.println("Digite o seu palpite para o número aleatório: ");
		numeroUsuario = sc.nextInt();
		int tentativas = 1;
		
		while(numeroAleatorio != numeroUsuario) {
			
			if(numeroAleatorio != numeroUsuario) {
				if(numeroAleatorio < numeroUsuario) {
					System.out.println("Você errou!");
					System.out.println("O número aleatório é menor que o número digitado. ");
				}else {
					System.out.println("Você errou!");
					System.out.println("O número aleatório é maior que o número digitado. ");
				}
				System.out.println("Digite outro número aleatório: ");
				numeroUsuario = sc.nextInt();
			}
			
			tentativas++;
		}
		
		acertou(numeroAleatorio, numeroUsuario);
		System.out.println("Tentativas: " + tentativas);
		sc.close();
	}

	public static void acertou(int n1, int n2) {
		if(n1 == n2) {
			System.out.println("Você acertou!");
		}
	}
	
}
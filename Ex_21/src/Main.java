import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		escolhas();
		
		sc.close();
	}

	public static void escolhas() {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		do {
			
			System.out.println("Escolha uma opção 1 a 3: ");
			n = sc.nextInt();
			
			if(n == 1) {
				System.out.println("Digite um número: ");
				int num = sc.nextInt();
				System.out.printf("Tabuada do número %d\n ", num);
				for(int i = 1; i <= 10; i++) {
					System.out.println(i + " X " + num + " = " + (i * num));
				}
			}else if(n == 2) {
				sc.nextLine();
				System.out.println("Digite seu nome: ");
				String nome = sc.nextLine();
				
				System.out.println("Olá, " + nome);
			}else if(n == 3) {
				System.out.println("Até á próxima. ");
			}
			
		} while(n != 3);
		
		sc.close();
	}
	
}

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> nome = new ArrayList<>();
		String res;
		do {
			
			System.out.println("Digite Um nome: ");
			nome.add(sc.nextLine());
			
			System.out.println("Você quer continuar?(s / n): ");
			res = sc.nextLine();
			
		}while(res.equals("s"));
		
		for(String nomes : nome) {
			System.out.println("Nomes: " + nomes);
		}
		
		sc.close();
	}

}
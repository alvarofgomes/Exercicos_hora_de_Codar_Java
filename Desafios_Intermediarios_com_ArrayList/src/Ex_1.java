import java.util.*;

public class Ex_1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ArrayList<String> nome = new ArrayList<>(Arrays.asList("Alvaro", "Lucas", "João", "Maria", "Luana", "Thallyta"));
		
		System.out.println("Digite um nome: ");
		String n = sc.nextLine();
		
		if(nome.contains(n)) {
			System.out.println("Posição do nome digitado é: " + nome.indexOf(n));
		}else {
			System.out.println("Nome não encontrado. ");
		}
		
		sc.close();
	}

}
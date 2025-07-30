import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		palavraDoUsuario();
		
		sc.close();
	}

	public static void palavraDoUsuario() {
		
		Scanner sc = new Scanner(System.in);
		
		String res;
		
		do {

			System.out.println("Digite Uma Palavra: ");
			String p = sc.nextLine();
			String[] palavras = p.trim().split("\\s+");
			System.out.println("O número de caracteres na palavra " + p + " é: " + palavras.length);
			
			System.out.println("Quer digitar outra frase(s para sim e não para parar.): ");
			res = sc.nextLine();
			
			
		} while(res.equalsIgnoreCase("s"));
	
		sc.close();
	}
	
}

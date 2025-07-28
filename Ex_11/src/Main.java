import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite Uma Letra: ");
		String letra = sc.nextLine();
		
		if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
			System.out.println("A Letra Digitada É Uma Vogal. ");
		}else {
			System.out.println("A Letra Digitada É Uma Consoante. ");
		}
		
		sc.close();
	}

}

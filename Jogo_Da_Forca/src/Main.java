import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String palavraSecreta = "TESTE";
		
		char[] palavraOculta = new char [palavraSecreta.length()];

		for(int i = 0; i < palavraOculta.length; i++) {
			palavraOculta[i] = '_';
		}
		
		int tentativas = 7;
		boolean venceu = false;
		
		while(tentativas >= 0) {
			
			System.out.println("Palavras: " + String.valueOf(palavraOculta));
			System.out.println("Restam: " + tentativas + " tentativas. ");
			System.out.print("Digite uma letra: ");
			char letra = sc.next().toUpperCase().charAt(0);

			System.out.println(letra);
			
			boolean acertou = false;
			
			for(int i = 0; i < palavraSecreta.length(); i++) {
				if(palavraSecreta.charAt(i) == letra) {
					palavraOculta[i] = letra;
					acertou = true;
				}
			}
			
			if(!acertou) {
				tentativas--;
				System.out.println("Letra incorreta! ");
			}else {
				System.out.println("Letra correta");
			}
			
			if(String.valueOf(palavraOculta).equals(palavraSecreta)) {
				venceu = true;
				break;
			}
			
		}
		
		if(venceu) {
			System.out.println("Parabéns, você venceu, ainda restavam " + tentativas + " tentativas. ");
		}else {
			System.out.println("Infelizmente, você perdeu. ");
			System.out.println("A palavra secreta era: "+  palavraSecreta);
		}
		
		sc.close();
	}

}

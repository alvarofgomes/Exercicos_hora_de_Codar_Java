import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma senha: ");
		String senha = sc.nextLine();
		
		int result = verificarforcaSenha(senha);
		
		if(result >= 4) {
			System.out.println("Sua senha é Forte! ");
		}else if(result >= 2) {
			System.out.println("Sua senha é Moderada! ");
		}else if(result < 2) {
			System.out.println("Sua senha é Fraca! ");
		}		
		
		sc.close();
	}
	//poderia ter melhorado a logica com matches(deixar anotado para melhorar no futuro. )
	public static int verificarforcaSenha(String senha) {
		
		int contadorNumero = 0;
		int contadorCaracteresEspeciais = 0;
		int contadorLetras = 0;
		int qtdDeDigitos = 0;
		int forca = 0;
		
		for(int i = 0; i < senha.length(); i++) {
			char c = senha.charAt(i);
			if(Character.isDigit(c)) {
				contadorNumero++;
			}else if(!Character.isLetterOrDigit(c)) {
				contadorCaracteresEspeciais++;
			}else {
				contadorLetras++;
			}
			qtdDeDigitos++;
		}
	
		if(contadorNumero >= 5) {
			forca += 1;
		}
		
		if(contadorCaracteresEspeciais >= 2) {
			forca += 1;
		}
		
		if(contadorLetras > 0) {
			forca += 1;
		}
		
		if(qtdDeDigitos >= 8) {
			forca += 1;
		}
		
		return forca;
		
	}

}

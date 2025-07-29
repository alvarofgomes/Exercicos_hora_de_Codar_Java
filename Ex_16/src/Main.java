import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		verificarIdade(20);
		System.out.println("Seja Bem Vindo! ");
		
		sc.close();
	}
	
	public static void verificarIdade(int i){
		if(i < 18) {
			System.out.println("Acesso negado. ");
			System.exit(0);
		}else {
			System.out.println("Acesso Permitido. ");
		}
	}

}
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite O Nome Do Usuário: ");
		String user = sc.nextLine();
		System.out.println("Digite A Senha Do Usuário: ");
		int senha = sc.nextInt();
		
		if(user.equals("admin") && senha == 1234) {
			System.out.println("O Usuário Tem O Acesso Permitido. ");
		}else {
			System.out.println("O Usuário Tem O Acesso Negado. ");
		}
		
		sc.close();
	}

}

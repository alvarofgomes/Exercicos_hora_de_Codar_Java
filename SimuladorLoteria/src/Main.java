import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Bilhete> bilhetes = new ArrayList<>();
		
		while(true) {
			System.out.println("Digite 6 números para o seu bilhete(entre 1 a 60)");
			
			System.out.println("Deseja registrar outro bilhete? (s / n)");
			String resposta = sc.next();
			
			if(resposta.equals("n")) {
				break;
			}
		}
		
		sc.close();
	}

}
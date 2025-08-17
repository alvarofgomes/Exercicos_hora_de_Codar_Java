import java.util.*;

public class Ex_3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ArrayList<String> nome = new ArrayList<>(Arrays.asList("Luana","Alvaro","Julia","Leandro","Ana","Joana"));
		
		System.out.println("Digite Uma Letra: ");
		String L = sc.nextLine();
			
		if(nome.removeIf(x -> x.toLowerCase().startsWith(L.toLowerCase()))){
			nome.remove(L);
			System.out.println("Nomes Com a letra: " + L + " foram removidos. ");
		}else {
			System.out.println("Não existe nenhum nome com a letra digitada: " + L);
		}

		System.out.println(nome);
		
		sc.close();
	}

}
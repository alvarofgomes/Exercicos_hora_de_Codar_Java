import java.util.*;

public class Ex_1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add("Alvaro");
		nomes.add("Wesley");
		nomes.add("Guilherme");
		nomes.add("Kauan");
		nomes.add("Edgard");
		
		for(String Nomes : nomes) {
			System.out.println("Nome: " + Nomes);
		}
		
		sc.close();
	}

}

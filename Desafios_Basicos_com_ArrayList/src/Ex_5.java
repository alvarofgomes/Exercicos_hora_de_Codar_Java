import java.util.*;

public class Ex_5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> nomes = new ArrayList<>();

		nomes.add("Luan");
		nomes.add("Luleta");
		nomes.add("Lola");
		nomes.add("Luna");
		nomes.add("Luca");
		
		int n = nomes.size();
		
		System.out.println("Quantidade de nomes: " + n);
		
		sc.close();
	}

}
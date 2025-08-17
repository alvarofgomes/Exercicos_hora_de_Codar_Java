import java.util.*;

public class Ex_2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> n = new ArrayList<>();
		
		System.out.println("Digite 10 números: ");
		for(int i = 0; i < 10; i++) {
			n.add(sc.nextInt());
		}
		
		Collections.sort(n);
		System.out.println("Do menor para o maior");
		for(Integer numeros : n) {
			System.out.println(numeros);
		}
		
		Collections.reverse(n);
		System.out.println("Do maior para o menor");
		for(Integer numeros : n) {
			System.out.println(numeros);
		}
		
		sc.close();
	}

}
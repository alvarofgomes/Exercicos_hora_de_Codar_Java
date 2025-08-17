import java.util.*;

public class Ex_4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> n = new ArrayList<>();
		
		System.out.println("Digite 8 números: ");
		for(int i = 0; i < 8; i++) {
			int num = sc.nextInt();
			if(n.contains(num)) {
				System.out.println("Número já existente, digite outro: ");
				n.add(sc.nextInt());
			}else {
				n.add(num);
			}
		}
		
		System.out.println(n);
		
		sc.close();
	}

}

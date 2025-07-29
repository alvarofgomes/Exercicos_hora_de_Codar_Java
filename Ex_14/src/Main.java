import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println(parOuImpar(9));
		
		sc.close();
	}

	public static String parOuImpar(int n) {
		
		if(n % 2 == 0) {
			return "O número digitado e par. ";
		}else {
			return "O número digitado e Ímpar. ";
		}
		
	}
	
}

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		numerosPares();
		
		sc.close();
	}

	public static void numerosPares() {
		
		int n = 1;
		
		while(n <= 20) {
			
			if(n % 2 == 0) {
				System.out.println("Número par = " + n);
			}
			
			n++;
			
		}
		
	}
	
}

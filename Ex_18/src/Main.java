import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		somaLoop();
		
		sc.close();
	}
	
	public static void somaLoop() {
		
		int s = 0;
		
		for(int i = 1; i <= 100; i++){
			s += i;
		}

		System.out.println("Soma de 1 a 100 = " + s);
		
	}
	
}

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite Um Número: ");
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("O Número Digitado É Par. ");
		}else{
			System.out.println("O Número Digitado É Impar. ");
		}
		
		sc.close();
	}

}

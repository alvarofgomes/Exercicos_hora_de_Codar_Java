import java.util.*;
public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite Um Número: ");
		int n = sc.nextInt();
		
		if(n >= 10 && n <= 20) {
			System.out.println("Dentro Do Intervalo. ");
		}else {
			System.out.println("Fora Do Intervalo. ");
		}
		
		sc.close();
	}

}

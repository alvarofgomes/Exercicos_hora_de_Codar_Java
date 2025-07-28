import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite O Valor Do Produto: ");
		double valor = sc.nextDouble();
		
		if(valor <= 50) {
			System.out.println("O Valor Do Produto Foi Barato. ");
		}else if(valor <= 100) {
			System.out.println("O Valor Do Produto Foi Justo. ");
		}else {
			System.out.println("O Valor Do Produto Foi Caro. ");
		}
		
		sc.close();
	}

}

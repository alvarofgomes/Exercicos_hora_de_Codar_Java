import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println(nota(5));
		System.out.println(nota(9));
		System.out.println(nota(11));
		
		sc.close();
	}
	
	public static String nota(int n) {
		
		if(n < 0 || n >10) {
			return "Nota Inválida";
		}
		
		switch(n) {
		
			case 10:
			case 9:
				return "Classificação: A";
			case 8:
				return "Classificação: B";
			case 7:
				return "Classificação: C";
			case 6:
				return "Classificação: D";
			default:
				return "Classificação: F";
		}
	}
	
}

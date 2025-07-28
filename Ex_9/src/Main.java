import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite Um Número De 1 A 7: ");
		int n = sc.nextInt();
		
		switch(n) {
			case 1: 
				System.out.println("Domingo");
				break;
			case 2: 
				System.out.println("Segunda-Feira");
				break;
			case 3: 
				System.out.println("Terça-Feira");
				break;
			case 4: 
				System.out.println("Quarta-Feira");
				break;
			case 5: 
				System.out.println("Quinta-Feira");
				break;
			case 6: 
				System.out.println("Sexta-Feira");
				break;
			case 7: 
				System.out.println("Sábado");
				break;
			default: 
				System.out.println("Número Digitado Não Corresponde A Nenhum Dia Da Semana Ou Final De Semana. ");
		}
		
		sc.close();
	}

}

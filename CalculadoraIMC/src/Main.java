import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite Seu Peso: ");
		double peso = sc.nextDouble();
		System.out.print("Digite A Sua Altura: ");
		double altura = sc.nextDouble();
		
		double IMC = peso / (altura * altura);
		System.out.printf("Seu IMC = %.2f\n", IMC);
		
		if(IMC < 18.5) {
			System.out.println("Abaixo Do Peso. ");
		}else if(IMC < 25) {
			System.out.println("Peso Normal. ");
		}else if(IMC <= 29.9){
			System.out.println("Sobrepeso. ");
		}else {
			System.out.println("Obesidade. ");
		}
		
		sc.close();
	}

}

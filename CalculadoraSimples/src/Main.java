import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] n = new double[3];
		
		for(int i = 0; i < 2; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			n[i] = sc.nextDouble();
		}
		
		System.out.println("Qual operação você vai querer: ");
		System.out.println("Soma: Digite( + ) | Subtração: Digite( - ) | Multiplicação: Digite( X ) | Divisão: Digite( / )");
		sc.nextLine();
		String op = sc.nextLine();
		
		double resultado = 0.0;
		
		if(op.equals("+")) {
			resultado = n[0] + n[1];
			System.out.printf("O resultado da Soma pelos números %.2f %s %.2f = %.2f", n[0], op, n[1], resultado);
		}else if(op.equals("-")) {
			double aux = 0.0;
			if(n[0] < n[1]) {
				aux = n[0];
				n[0] = n[1];
				n[1] = aux;
			}
			resultado = n[0] - n[1];
			System.out.printf("O resultado da Subtração pelos números %.2f %s %.2f = %.2f", n[0], op, n[1], resultado);
		}else if(op.equalsIgnoreCase("x")) {
			resultado = n[0] * n[1];
			System.out.printf("O resultado da Multiplicação pelos números %.2f %s %.2f = %.2f", n[0], op, n[1], resultado);
		}else if(op.equals("/")) {
			if(n[0] == 0 || n[1] == 0) {
				System.out.println("Erro número não divisivel por 0. ");
				System.exit(0);
			}
			resultado = n[0] / n[1];
			System.out.printf("O resultado da Divisão pelos números %.2f %s %.2f = %.2f", n[0], op, n[1], resultado);
		}else {
			System.out.println("Operação digitada é inválida. ");
		}
		
		sc.close();
	}
		
}

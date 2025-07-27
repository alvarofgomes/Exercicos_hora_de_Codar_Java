import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite O Nome Do Aluno: ");
		String nome = sc.nextLine();
		
		double[] n = new double[3];
		double soma = 0.0;
		
		for(int i = 0; i < 3; i++) {
			
			System.out.println("Digite A " + (i + 1) + "º Nota Do Aluno: " + nome);
			n[i] = sc.nextDouble();
			soma += n[i];
			
		}

		double media = soma / 3.0;
		
		System.out.printf("Aluno: %s Nota = %.2f\n", nome, media);
		
		if (media < 7.0) {
			
			System.out.printf("O Aluno: %s Está Reprovado. ", nome);
			
		}else {
			
			System.out.printf("O Aluno: %s Está Aprovado. ", nome);
			
		}
		
		sc.close();
		
	}

}

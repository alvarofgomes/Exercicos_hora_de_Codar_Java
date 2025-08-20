import java.util.*;

public class Ex_2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ArrayList<Aluno> a = new ArrayList<>();
		
		double s = 0.0;
		double maior = 0.0;
		double menor = 10.0;
		
		for(int i = 0; i < 5; i++) {
			
			Aluno aluno = new Aluno();
			
			System.out.println("Digite o nome do " + (i + 1) + "º aluno: ");
			String nome = sc.nextLine();
			aluno.setName(nome);
			
			if(!a.contains(aluno)) {
				a.add(aluno);
			}
			
			System.out.println("Digite a nota do " + (i + 1) + "º aluno: ");
			double n = sc.nextDouble();
			sc.nextLine();
			aluno.setNota(n);
			
			if(!a.contains(aluno)) {
				a.add(aluno);
			}
			
			s += aluno.getNota();
			
			if(aluno.getNota() > maior) {
				maior = aluno.getNota();
			}
			
			if(aluno.getNota() < menor) {
				menor = aluno.getNota();
			}
			
		}
		
		System.out.println("Média da turma: " + String.format("%.2f", (s / 5)));
		System.out.println("A maior nota da turma: " + String.format("%.1f", maior));
		System.out.println("A menor nota da turma: " + String.format("%.1f", menor));
		
		sc.close();
	}

}
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de alunos desejada: ");
		int qtdAlunos = sc.nextInt();
		
		Aluno[] a = new Aluno[qtdAlunos];
		
		for(int i = 0; i < qtdAlunos; i++) {
			
			System.out.println("Cadastro do " + (i+1) + "º aluno: ");
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Matrícula: ");
			String matricula = sc.nextLine();
			System.out.println("Quantidade de notas: ");
			int qtdNotas = sc.nextInt();
			
			Aluno aluno = new Aluno(nome,matricula,qtdNotas);
			
			aluno.adicionarNota();
			
			a[i] = aluno;
			
		}
		System.out.println("Exibir resultados: ");
		for(int i = 0; i < a.length; i++) {
			
			a[i].exibirResultado();
			System.out.println();
		}
		
		sc.close();
	}

}
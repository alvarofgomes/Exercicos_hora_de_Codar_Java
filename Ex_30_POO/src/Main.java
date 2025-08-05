import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//obj 1
		Aluno a = new Aluno(111111);
		a.setNotaFinal(90);
		a.setNome("Ana Maria");
		System.out.println(a);
		
		
		//obj 2
		Aluno a1 = new Aluno(222222);
		a1.setNotaFinal(60);
		a1.setNome("João Gabriel");
		System.out.println(a1);
		
		
		sc.close();
	}

}
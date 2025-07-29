import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int soma = somaRecursiva(6);
		
		System.out.println(soma);
		
		System.out.println(soma(2,3));
		System.out.println(soma(2,1,5));
		System.out.println(soma(1.5,1.5));
		
		//Função anonima(Lambda)
		Runnable tarefa = () -> System.out.println("Está é uma função anonima. ");
				
		tarefa.run();
		
		List<String> nomes = Arrays.asList("Ana","Pedro","Paulo");
		
		nomes.forEach(nome -> System.out.println(nome));
		
		sc.close();
	}

	public static int somaRecursiva(int n) {
		
		if(n == 1) {
			return 1;
		}else {
			return n + somaRecursiva(n-1);
		}
		
	}
	
	//método Overloading
	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static int soma(int a, int b, int c) {
		return a + b + c;
	}
	
	public static double soma(double a, double b) {
		return a + b;
	}
	
	
	
}
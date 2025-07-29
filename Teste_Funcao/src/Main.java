import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		saudacao();
		soma(1, 2);
		saudar("Alvaro");
		System.out.println(dobrar(2));
		System.out.println(verificarPar(1));
		
		
		sc.close();
	}

	public static void saudacao() {
		System.out.println("Olá, Esta É A Minha Primeira Função! ");
	}
	
	public static void soma(int a, int b) {
		int soma = a+b;
		System.out.println("O Resultado Da Soma É: " + soma);
	}
	
	public static void saudar(String nome) {
		System.out.println("Olá, " + nome + " Tudo Bem? ");
	}
	
	public static int dobrar(int n) {
		return n*2;
	}
	
	public static String verificarPar(int n) {
		if(n % 2 == 0) {
			return "O número" + n + " é par";
		}else {
			return "O número" + n + " não é par";
		}
	}
	
}
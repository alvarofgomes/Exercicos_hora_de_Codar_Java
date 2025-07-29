import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println(verificarAcesso(19, true, true));
		System.out.println(verificarAcesso(25, false, true));
		System.out.println(obterDiasDaSemana(5));
		System.out.println(obterDiasDaSemana(10));
		verificarAutenticacao("admin","SenhaSegura");
		System.out.println("Oi! ");
		System.out.println(calcularMedia(5,6,7));

		sc.close();
	}

	public static String verificarAcesso(int idade, boolean carteiraHabilitacao, boolean historicoNegativo) {
		if(idade >= 18 && carteiraHabilitacao && !historicoNegativo) {
			return "Acesso permitido: todos os critérios atendidos! ";
		} else if(idade>= 18 && carteiraHabilitacao && historicoNegativo){
			return "Acesso negado: Histórico negativo detectado! ";
		}else {
			return "Acesso negado: Critérios não atendidos! ";
		}
	}
	
	public static String obterDiasDaSemana(int dia) {
		
		switch(dia) {
			case 1: 
				return "Domingo";
			case 2: 
				return "Segunda-Feira";
			case 3: 
				return "Terça-Feira";
			case 4: 
				return "Quarta-Feira";
			case 5: 
				return "Quinta-Feira";
			case 6: 
				return "Sexta-Feira";
			case 7: 
				return "Sábado";
			default:
				return "Dia Da Semana Não Encontrado, Com O Número Digitado. ";
				
		}
		
	}
	
	public static void verificarAutenticacao(String usuario, String senha) {
		if(!usuario.equals("admin") && !senha.equals("SenhaSegura")) {
			System.out.println("Autenticação Falhou! ");
			System.exit(1);
		}else {
			System.out.println("A Autenticação Foi Um Sucesso! ");
		}
	}
	
	/** 
	 * 
	 *  Calcular a média de três números inteiros
	 *  
	 *  @param n1 O primeiro número/nota a ser enviado
	 *  @param n2 O segundo número/nota a ser enviado
	 *  @param n3 O terceiro número/nota a ser enviado
	 *  
	 *  @return A média dos três números
	 */
	public static double calcularMedia(int n1, int n2, int n3) {
		return (n1+n2+n3) / 3;
	}
	
}
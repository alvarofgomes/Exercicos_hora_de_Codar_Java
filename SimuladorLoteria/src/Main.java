import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Bilhete> bilhetes = new ArrayList<>();
		
		while(true) {
			System.out.println("Digite 6 números para o seu bilhete(entre 1 a 60)");
			
			int[] numerosEscolhidos = new int[6];
			for(int i = 0; i < numerosEscolhidos.length; i++) {
				System.out.println("Digite o " + (i+1) + "º número: ");
				numerosEscolhidos[i] = sc.nextInt();
			}
			
			Bilhete bilhete = new Bilhete(numerosEscolhidos);
			
			bilhetes.add(bilhete);
			
			System.out.println("Deseja registrar outro bilhete? (s / n)");
			String resposta = sc.next();			
			
			if(resposta.equals("n")) {
				break;
			}
		}
		
		System.out.println("Realizando sorteio... ");
		for(Bilhete b : bilhetes) {
			b.realizarSorteio();
			b.exibirResultados();
		}
		
		sc.close();
	}

}
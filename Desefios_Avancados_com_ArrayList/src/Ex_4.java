import java.util.*;

public class Ex_4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Jogador> j = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			
			Jogador jogador = new Jogador();
			
			System.out.println("Digite o nome do " + (i+1) + "º jogador: ");
			String nome = sc.nextLine();
			jogador.setJogador(nome);
			if(!j.contains(jogador)) {
				j.add(jogador);
			}
			
			System.out.println("Digite a pontuação do " + (i+1) + "º jogador: ");
			double pontos = sc.nextDouble();
			sc.nextLine();
			jogador.setPonto(pontos);
			if(!j.contains(jogador)) {
				j.add(jogador);
			}
			
		}
		
		Collections.sort(j, Comparator.comparingDouble(Jogador::getPonto).reversed());
		
		for(Jogador jog : j) {
			System.out.println(jog);
		}
		
		sc.close();
	}

}

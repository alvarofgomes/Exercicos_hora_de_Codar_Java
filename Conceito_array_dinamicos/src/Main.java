import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Array dinamicos
		ArrayList<String> frutas = new ArrayList<>();
		//Array Vazio
		System.out.println(frutas);
		
		frutas.add("Maçã");
		frutas.add("Banana");
		
		System.out.println("Frutas do array: " + frutas);
		
		for(String f : frutas) {
			System.out.println("Frutas do array: " + f);
		}
		//removendo fruta do indice
		frutas.remove(0);
		
		System.out.println("Removendo fruta do indice 0: " + frutas);
		
		frutas.add("Maçã");
		
		String frutasEspecificas = frutas.get(0);
		
		System.out.println(frutasEspecificas);
		
		//Não fuciona com indice diretamente(Tem que utilizar o metodo get())
		// System.out.println(frutas[0]);
		
		sc.close();
	}

}
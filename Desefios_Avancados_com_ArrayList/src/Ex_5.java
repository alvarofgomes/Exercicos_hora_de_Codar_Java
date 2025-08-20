import java.util.*;

public class Ex_5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ArrayList<Livro> biblioteca = new ArrayList<>();
		
		System.out.println("Digite [1] Para cadastrar um livro: ");
		int n = sc.nextInt();
		
		while(n != 0){
			
			Livro L = new Livro();			
			
			switch(n) {
			
				case 1:
					
					System.out.println("Digite o nome do livro: ");
					sc.nextLine();
					String nomeLivro = sc.nextLine();
					L.setTitulo(nomeLivro);
					if(!biblioteca.contains(L)) {
						biblioteca.add(L);
					}
					
					System.out.println("Digite o nome do autor: ");
					String nomeAutor = sc.nextLine();
					L.setAutor(nomeAutor);
					if(!biblioteca.contains(L)) {
						biblioteca.add(L);
					}
					break;
				case 2: 
			
					if(biblioteca != null && !biblioteca.isEmpty()) {
						for(Livro l : biblioteca) {
							System.out.println(l);
						}
					}else {
						System.out.println("Não tem livros para mostrar. ");
					}
			
					break;
				case 3: 
					
					System.out.println("Digite o titulo que está buscando: ");
					sc.nextLine();
					String t = sc.nextLine();
					
					boolean encontrado = false;
					for (Livro l : biblioteca) {
					    if (l.getTitulo().equalsIgnoreCase(t)) {
					        System.out.println(l);
					        encontrado = true;
					    }
					}
					
					if (!encontrado) {
					    System.out.println("O título digitado não existe.");
					}
					
					break;
				default:
					System.out.println("Número digitado inválido. ");
			
			}
			
		System.out.println("Digite [1] Para cadastrar um livro: ");
		System.out.println("Digite [2] Para listar livros: ");
		System.out.println("Digite [3] Para procurar livro: ");
		System.out.println("Digite [0] Para sair: ");
		n = sc.nextInt();
			
		}
		
		System.out.println("Saiu do programa. ");
		
		sc.close();
	}

}

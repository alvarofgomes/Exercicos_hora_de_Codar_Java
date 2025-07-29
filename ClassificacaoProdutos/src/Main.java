import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i;
		String[] produto = new String[10];
		produto[0] = "Macarrão"; 
		produto[1] = "Leite"; 
		produto[2] = "Feijão"; 
		
		System.out.println("Digite O Nome Do Produto Existente Ou Adicione Um Novo: ");
		for(i = 3; i <= 3; i++) {
			produto[i] = sc.nextLine();
		}
		
		if(produto[3].equals(produto[0]) || produto[3].equals(produto[1]) || produto[3].equals(produto[2])) {
			System.out.println("Produto Está Catalogado. ");
			System.out.println("Deseja Alterar O Valor Do Produto sim ou não(s/n): ");
			String alter = sc.nextLine();
			
			if(alter.equalsIgnoreCase("s")) {
				System.out.println("Digite Um Novo Valor Do Para O Produto: ");
				double valor = sc.nextDouble();
				
				if(valor <= 50) {
					System.out.printf("Nome Do Produto: %s | Preço Do Produto: %.2f", produto[3], valor, "O Produto Está Barato. ");
				}else if(valor <= 100) {
					System.out.printf("Nome Do Produto: %s | Preço Do Produto: %.2f", produto[3], valor, "O Produto Está Moderado. ");
				}else {
					System.out.printf("Nome Do Produto: %s | Preço Do Produto: %.2f", produto[3], valor, "O Produto Está Caro. ");
				}
			}
			
		}else {
			System.out.println("Produto Adicionado. ");
			System.out.println("Digite O Valor Do Produto Adicionado: ");
			double valor = sc.nextDouble();
			
			if(valor <= 50) {
				System.out.printf("Nome Do Produto: %s | Preço Do Produto: %.2f", produto[3], valor, "O Produto Está Barato. ");
			}else if(valor <= 100) {
				System.out.printf("Nome Do Produto: %s | Preço Do Produto: %.2f", produto[3], valor, "O Produto Está Moderado. ");
			}else {
				System.out.printf("Nome Do Produto: %s | Preço Do Produto: %.2f", produto[3], valor, "O Produto Está Caro. ");
			}

		}
		
		sc.close();
	}

}

import java.util.*;

public class Ex_1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> tarefa = new ArrayList<>();
		
		int n = 0;
		
		System.out.println("Digite: [1] para adicionar uma tarefa: ");
		n = sc.nextInt();
		while(n != 0) {
			
			switch(n) {
			
				case 1:
					System.out.println("Digite a atividade que você quer adicionar: ");
					sc.nextLine();
					tarefa.add(sc.nextLine());
					System.out.println("Tarefa adicionada. ");
					break;
				case 2: 
					
					if(tarefa != null && !tarefa.isEmpty()) {
						System.out.println("Digite a tarefa que você deseja remover: ");
						tarefa.remove(sc.nextInt());
						System.out.println("Tarefa removida. ");
					}else {
						System.out.println("Tarefas Vazias não tem o que remover. ");
					}
					break;
				case 3:
					if(tarefa != null && !tarefa.isEmpty()) {
						for(String tarefas : tarefa) {
							System.out.println(tarefas);
						}
					}else {
						System.out.println("Não tem tarefas para ser exibidas. ");
					}
					break;
				default:
					System.out.println("Digite um número entre 0 e 3");
			
			}
			
			System.out.println("Digite: [1] para adicionar uma tarefa: ");
			System.out.println("Digite: [2] para remover uma tarefa: ");
			System.out.println("Digite: [3] para listar todas as tarefa: ");
			System.out.println("Digite: [0] para sair: ");
			n = sc.nextInt();
			
		}
		
		System.out.println("Você saiu de suas tarefas. ");
		
		sc.close();
	}

}

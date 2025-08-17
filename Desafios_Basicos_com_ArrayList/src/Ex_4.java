import java.util.*;

public class Ex_4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ArrayList<String> nome = new ArrayList<>();
		
		nome.add("ana");
		nome.add("julia");
		nome.add("maria");
		nome.add("luana");
		nome.add("lucas");
		
		System.out.println("Digite um nome: ");
		String n = sc.nextLine();
		
		if(nome.contains(n)) {
			nome.remove(n);
		}else {
			System.out.println("Nome não existe na lista. ");
		}
		
		for(String nomes : nome) {
			System.out.println("Nome: " + nomes);
		}
		
		sc.close();
	}

}

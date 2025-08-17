import java.util.*;

public class Ex_5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Pessoas> p = new ArrayList<>();
		
		for(int i = 0; i < 3; i++) {
			Pessoas pessoa = new Pessoas();
			System.out.println("Digite o nome da " + (i+1) + "º Pessoa: ");
			String name = sc.nextLine();
			pessoa.setName(name);
			if (!p.contains(pessoa)) {
			    p.add(pessoa);
			}
			System.out.println("Digite a idade da " + (i+1) + "º Pessoa: ");
			int age = sc.nextInt();
			sc.nextLine();
			pessoa.setAge(age);
			if (!p.contains(pessoa)) {
			    p.add(pessoa);
			}
		}
		
		for(Pessoas pes : p) {
			System.out.println(pes.toString());
		}
		
		sc.close();
	}

}
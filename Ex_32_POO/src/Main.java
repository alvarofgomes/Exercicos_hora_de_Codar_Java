import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ProdutoEletronico p = new ProdutoEletronico("Telefone", 2000.0, false);
		
		p.desconto(10);
		
		System.out.println(p);
		
		sc.close();
	}  

}
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ContaCorrente c = new ContaCorrente(1000.0);
		
		c.depositar(2000);
		c.saque(500);
		c.exibirSaldo();
		c.depositar(200);
		c.exibirSaldo();
		
		sc.close();
	}

}

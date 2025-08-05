import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Celular c = new Celular("Apple", "Iphone x", 100);
		
		c.ligar();
		c.consumoBateria(5);
		
		System.out.println(c);
		
		Celular x = new Celular("Xiaomi", "Xiaomi 12", 100);
		
		x.ligar();
		x.consumoBateria(90);
		System.out.println(x);
		sc.close();
	}

}
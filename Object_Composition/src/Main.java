public class Main {

	public static void main(String[] args) {

		Documento d1 = new Documento("CPF", "123.456.789-22");
		Pessoa p1 = new Pessoa("Luines Silva", d1);
		
		p1.exibirInfo();
		
	}

}
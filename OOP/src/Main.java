import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		car fusca = new car();
		
		fusca.marca = "VW";
		fusca.modelo = "Fusca";
		fusca.ano = 2000;
		
		//fusca.exibirInformacao();
		fusca.aumentarVelocidade(10.0);
		fusca.ligarMotor();
		System.out.println(fusca.motorLigado);
		
		fusca.aumentarVelocidade(10.0);
		fusca.aumentarVelocidade(20.0);
		
		Pessoa p = new Pessoa();
		
		p.setNome("João");
		p.setIdade(15);
		
		System.out.println("O nome da pessoa é: " + p.getNome() + " a idade é: " + p.getIdade());
		
		ContaBancaria c = new ContaBancaria();
		
		c.setTitular("Ana");
		
		c.setSaldo(1000);
		
		System.out.println(c);
		
		Produto prod = new Produto();
		
		prod.setNomeProduto("Camisa");
		System.out.println(prod.getNomeProduto());
		
		prod.setPreco(30);
		
		prod.aplicarDesconto(10);
		
		Livro l = new Livro("Estudando POO", "Matheus", 28.00);
		
		l.exibirInfo();
		
		sc.close();
	}

}
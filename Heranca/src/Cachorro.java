public class Cachorro extends Animal{
	
	// A classe cachorro que está extendendo Animal e obrigado a usar as propriedades de animal - super
	public Cachorro(String nome) {
		super(nome);
	}

	public void latir() {
		System.out.println(getNome() + " Está latindo!!");
	}
	
}
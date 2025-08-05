public class ProdutoEletronico {
	
	private String nome;
	private double preco;
	private boolean garantia;
	
	public ProdutoEletronico(String nome, double preco, boolean garantia) {
		this.nome = nome;
		this.preco = preco;
		this.garantia = garantia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean getGarantia() {
		return garantia;
	}

	public void setGarantia(boolean garantia) {
		this.garantia = garantia;
	}
	
	public void desconto(int desconto) {
		if(desconto > 0 && desconto <= 100) {
			setPreco(getPreco() - calcularDesconto(desconto));
		}else {
			System.out.println("Desconto Incorreto");
		}
	}
	
	private double calcularDesconto(int desconto) {
		return (this.preco * desconto) / 100;
	}

	public String toString() {
		return "ProdutoEletronico: nome = " + getNome() + ", preco = " + getPreco() + ", garantia = " + getGarantia();
	}
	
}

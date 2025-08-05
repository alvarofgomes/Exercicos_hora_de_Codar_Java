public class Produto {

	private String nomeProduto;
	private double preco;
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public void setNomeProduto(String nomeProduto) {
		if(nomeProduto != null && !nomeProduto.isEmpty() && nomeProduto.length() > 3) {
			this.nomeProduto = nomeProduto;
		}else {
			System.out.println("O nome enviado não atende os critérios. ");
		}
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		if(preco > 0) {
			this.preco = preco;
		}else {
			System.out.println("Preço não pode ser negativo ou igual a 0. ");
		}
	}
	
	public void aplicarDesconto(double porcentagem) {
		if(porcentagem > 0 && porcentagem <= 100) {
			double desconto = calcularDesconto(porcentagem);
			this.preco -= desconto;
			System.out.println("Desconto de " + porcentagem + "% aplicado!");
			System.out.println(this.getPreco());
		}else {
			System.out.println("Porcentagem inválida. ");
		}
	}
	
	private double calcularDesconto(double porcentagem) {
		return (this.preco * porcentagem) / 100;
	}
	
}

public class ContaCorrente {

	private double saldo;
	private String titular;
	private double limiteSaque;
	
	public ContaCorrente(double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getLimiteSaque() {
		return limiteSaque;
	}
	
	public void setLimiteSaque(double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	public void depositar(int depositar) {
		this.setSaldo(getSaldo() + depositar);
	}
	
	public void saque(int saque) {
		if(saque >= getLimiteSaque()) {
			System.out.println("Valor do saque é maior que o permitido. ");
		}else {
			this.setSaldo(getSaldo() - saque); 
		}
	}
	
	public void exibirSaldo() {
		System.out.println(getSaldo());
	}
	
}
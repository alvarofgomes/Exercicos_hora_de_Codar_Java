public class ContaBancaria {
	
	private String titular;
	private double saldo;
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		if(titular != null && !titular.isEmpty()) {
			this.titular = titular;
		}else {
			System.out.println("Nome do titular invalido. ");
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		if(saldo >= 0) {
			this.saldo = saldo;
		}else {
			System.out.println("O valor tem que ser positivo. ");
		}
	}
	
	public String toString() { 
		return "O nome do titular é: " + getTitular() + " Saldo da conta: " + getSaldo(); 
	}
	
}

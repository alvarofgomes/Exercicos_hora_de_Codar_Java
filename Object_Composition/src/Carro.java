public class Carro{

	private String marca;
	private String modelo;
	private Motor motor;
	
	public Carro(String marca, String modelo, Motor motor) {
		this.marca = marca;
		this.modelo = modelo;
		// Propriedades do object composition
		this.motor = motor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	public void exibirInfo() {
		System.out.println("Carro marca: " + getMarca() + ", modelo: " + getModelo());
		motor.exibirInfo();
	}
	
}
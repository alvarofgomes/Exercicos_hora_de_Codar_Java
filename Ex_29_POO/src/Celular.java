public class Celular {

	private String marca;
	private String modelo;
	private int bateria;
	private boolean celular;
	
	public Celular(String marca, String modelo, int bateria) {
		this.marca = marca;
		this.modelo = modelo;
		this.bateria = bateria;
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

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}
	
	public boolean getCelular() {
		return celular;
	}

	public void setCelular(boolean celular) {
		this.celular = celular;
	}

	public void ligar() {
		setCelular(true);
	}

	public void desligar() {
		setCelular(false);
	}
	
	public void consumoBateria(int bateria) {
		if(getCelular()) {
			setBateria(getBateria() - bateria);
		}else {
			System.out.println("O celular está desligado. ");
		}
	}
	
	public String toString() {
		return "A marca do celuar é " + getMarca() + " O Modelo: " + getModelo() + " Porcentagem Da Bateria: " + getBateria() + "%";
	}
	
}

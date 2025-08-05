public class car {

	public String marca;
	public String modelo;
	int ano;
	
	double velocidadeAtual = 0;
	boolean motorLigado = false;
	
	public void acelerar() {
		System.out.println("Carro está acelerando. ");
	}
	
	public void exibirInformacao(){
		System.out.println("Marca: " + marca + ", modelo: " + modelo + ", ano: " + ano);
	}
	
	public void ligarMotor() {
		if(!motorLigado) {
			motorLigado = true;
			System.out.println("Ligando motor... ");
		}else {
			System.out.println("O motor já está ligado! ");
		}
	}
	
	public void aumentarVelocidade(double incremento) {
		if(motorLigado) {
			velocidadeAtual += incremento;
			System.out.println("A velocidade atual é: " + velocidadeAtual);
		}else {
			System.out.println("Primeiro precisa ligar o motor. ");
		}
	}
	
}
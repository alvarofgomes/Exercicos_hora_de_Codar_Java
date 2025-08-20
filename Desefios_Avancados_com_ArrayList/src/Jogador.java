public class Jogador {

	private String jogador;
	private double ponto;
	
	public String getJogador() {
		return jogador;
	}
	
	public void setJogador(String jogador) {
		this.jogador = jogador;
	}
	
	public double getPonto() {
		return ponto;
	}
	
	public void setPonto(double ponto) {
		this.ponto = ponto;
	}
	
	public String toString() {
		return "Nome do jogador: " + getJogador() + " | Pontos do jogador: " + getPonto();
	}
	
}

import java.util.*;

public class Bilhete {

	private int[] numerosEscolhidos;
	private int[] resultadoDoSorteio;
	
	public Bilhete(int[] numerosEscolhidos) {
		this.numerosEscolhidos = numerosEscolhidos;
	}

	public int[] getNumerosEscolhidos() {
		return numerosEscolhidos;
	}

	public void setNumerosEscolhidos(int[] numerosEscolhidos) {
		this.numerosEscolhidos = numerosEscolhidos;
	}

	public int[] getResultadoDoSorteio() {
		return resultadoDoSorteio;
	}

	public void setResultadoDoSorteio(int[] resultadoDoSorteio) {
		this.resultadoDoSorteio = resultadoDoSorteio;
	}
	
	public void realizarSorteio() {
		Random random = new Random();
		
		resultadoDoSorteio = new int[6];
		
		for(int i =0; i < resultadoDoSorteio.length; i++) {
			resultadoDoSorteio[i] = random.nextInt(60) + 1;
		}
		Arrays.sort(resultadoDoSorteio);
	}
	
	public int contarAcertos() {
		int acertos = 0;
		for(int numerosEscolhido : numerosEscolhidos) {
			for(int numeroSorteado : resultadoDoSorteio) {
				if(numerosEscolhido == numeroSorteado) {
					acertos++;
				}
			}
		}
		return acertos;
	}
	
	public void exibirResultados() {
		System.out.println("Números escolhidos: " + Arrays.toString(numerosEscolhidos));
		System.out.println("Números sorteados: " + Arrays.toString(resultadoDoSorteio));
		
		int acertos = contarAcertos();
		
		System.out.println(acertos + " Acertos. ");
		System.out.println();
	}
	
}
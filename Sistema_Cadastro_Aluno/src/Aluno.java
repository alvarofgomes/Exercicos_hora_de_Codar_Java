import java.util.*;

public class Aluno {
	
	Scanner sc = new Scanner(System.in);
	
	private String name;
	private String registration;
	private double[] notas;
	
	public Aluno(String name, String registration, int quantidadeNotas) {
		
		this.name = name;
		this.registration = registration;
		this.notas = new double[quantidadeNotas];
		
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getRegistration() {
		return registration;
	}
	
	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public double[] getNota() {
		return notas;
	}

	public void setNota(double[] nota) {
		this.notas = nota;
	}
	
	public void adicionarNota() {
		
		for(int i = 0; i < this.notas.length; i++){
			System.out.println("Digite a " + (i+1) + "º nota do aluno: ");
			this.notas[i] = sc.nextDouble();
			
		}
		
	}
	
	public double calcularMedia() {
		
		double soma = 0.0;
		
		for(int i = 0; i < this.notas.length; i++){
			soma += this.notas[i];
		}
		
		return soma / this.notas.length;
		
	}
	
	public void exibirResultado() {
		System.out.println("Nome do aluno: " + this.getName());
		System.out.println("Matrícula do aluno: " + this.getRegistration());
		System.out.println("Média do aluno: " + calcularMedia());
		
		if(calcularMedia() >= 6) {
			System.out.println("Aluno: " + this.getName() + " Aprovado!!! ");
		}else{
			System.out.println("Aluno: " + this.getName() + " Reprovado!!! ");
		}
		
	}
	
}
public class Aluno {

	private String nome;
	private int matricula;
	private int notaFinal;
	
	public Aluno(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome != null && !nome.isEmpty() && nome.length() >= 3) {
			this.nome = nome;
		}else {
			System.out.println("Nome do aluno não é válido. ");
		}
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(int notaFinal) {
		if(notaFinal >= 0 && notaFinal <= 100) {
			this.notaFinal = notaFinal;
		}else {
			System.out.println("Nota digitada não é válida. ");
		}
	}
	
	public String toString(){
		return "Aluno: " + getNome() + " Mtricula: " + getMatricula() + " Nota: " + getNotaFinal();
	}
	
}

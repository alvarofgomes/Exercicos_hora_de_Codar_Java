public class Aluno {

	private String name;
	private double nota;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getNota() {
		return nota;
	}
	
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public String toString() {
		return "Nome do aluno: " + name + " Nota do aluno: " + nota;
	}
	
}

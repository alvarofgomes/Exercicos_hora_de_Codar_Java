public class Livro {

	private String titulo;
	private String autor;
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String toString() {
		return "Nome do titulo: " + getTitulo() + "| Nome do autor: " + getAutor();
	}
	
}

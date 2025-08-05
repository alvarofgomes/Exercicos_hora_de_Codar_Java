public class LivroBiblioteca {

	private String titulo;
	private String autor;
	private boolean disponivel;

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

	public boolean getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		if(this.disponivel) {
			this.disponivel = disponivel;
			System.out.println("Você Pegou o livro para leitura");
		}else {
			System.out.println("O livro não está disponivel. ");
		}
	}
	
	public void livroEmprestado() {
		if(disponivel) {
			disponivel = false;
			System.out.println("Você pegou livro emprestado: " + getTitulo());
		}else {
			System.out.println("O livro: " + getTitulo() + " não está disponivel. ");
		}
	}
	
	public void livrodevolvido() {
		if(!disponivel) {
			disponivel = true;
			System.out.println("Você devolveu o livro: " + getTitulo());
		}else {
			System.out.println("O livro: " + getTitulo() + " já está disponivel. ");
		}
	}

	@Override
	public String toString() {
		return "LivroBiblioteca titulo = " + getTitulo() + ", autor = " + getAutor() + ", disponivel = " + getDisponivel();
	}
	
	
	
}

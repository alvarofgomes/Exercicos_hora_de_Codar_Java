public class Pessoa {

	private String nome;
	private Documento documento;
	
	public Pessoa(String nome, Documento documento) {
		this.nome = nome;
		this.documento = documento;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void exibirInfo() {
		System.out.println("Nome: " + getNome());
		documento.exibirInfo();
	}
	
}
package Exercicio2;

public class Livro {
	private String titulo;
	private String editora;
	private int anoDeLancamento;
	private int numPaginas;
	
	public Livro(String titulo, String editora, int anoDeLancamento, int numPaginas) {
		this.titulo = titulo;
		this.editora = editora;
		this.anoDeLancamento = anoDeLancamento;
		this.numPaginas = numPaginas;
	}
	
	public Livro() {
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	public void ImprimirInfo(String titulo, String editora, int anoDeLancamento, int numPaginas) {
		System.out.println("Livro: " + titulo + ", Editora: " + editora + ", Ano de lançamento: " + anoDeLancamento + " e Número de páginas: " + numPaginas);
	}
	
	
	
}

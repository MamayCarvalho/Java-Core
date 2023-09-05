package entities;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private String idLivro;
	private String titulo;
	private String autor;
	private String ano;
	private String genero;
	private String editora;
	private String qntPaginas;
	
	public Biblioteca(String idLivro, String titulo, String autor, String ano, String genero, String editora,
			String qntPaginas) {
		
		this.idLivro = idLivro;
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.genero = genero;
		this.editora = editora;
		this.qntPaginas = qntPaginas;
	}

	private List<Biblioteca> livros = new ArrayList<Biblioteca>();
	
	public String getIdLivro() {
		return idLivro;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getAno() {
		return ano;
	}

	public String getGenero() {
		return genero;
	}

	public String getEditora() {
		return editora;
	}

	public String getQntPaginas() {
		return qntPaginas;
	}
	
	
	public String toString() {
		return "ID do livro: " + getIdLivro() + "\nTítulo: " + getTitulo() + "\nAutor: " + getAutor() + "\nAno de publicação: " 
	+ getAno() + "\nGenero: " + getGenero() + "\nEditora: " + getEditora() + "\nPáginas: " + getQntPaginas();
	}
	
	public void adicionarLivro( Biblioteca livro) {
		livros.add(livro);
	}
	
	public void listaLivros() {
		System.out.println("Segue abaixo os Livros Cadastrados: ");
		for (Biblioteca biblioteca : livros) {
			System.out.println(biblioteca);
		}
		System.out.println("\nVocê possui " + qntLivros() + " livro(s) cadastrado(s).");
	}
	public void removerLivro(String titulo) {
		//Iterator<Biblioteca>iterator = livros.iterator();
	//	while (iterator.hasNext()) {
		//	Biblioteca biblioteca = iterator.next();
			//	if(biblioteca.getTitulo().equals(titulo)) {
			//	iterator.remove();
			//	System.out.println("Livro removido da biblioteca com sucesso.");
			//	return;
		for (Biblioteca biblioteca : livros) {
			if(biblioteca.getTitulo().equals(titulo)) {
				livros.remove(biblioteca);
				System.out.println("Livro removido da biblioteca com sucesso.");
				return;
			}
		}
		System.out.println("Livro não localizado na biblioteca.");
	}
	public int qntLivros() { 
		return livros.size();
	}
}
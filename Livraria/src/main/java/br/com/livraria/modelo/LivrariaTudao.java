package br.com.livraria.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LivrariaTudao {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idLivro;
	private String titulo;
	private String autor;
	private String editora;
	
	
    private String categoria;
    private String isbn;
	private String capa;
    
    private double preco;
    
    
    //Encapsulamento: botão direito - source - generate get set
    
    public int getIdLivro() {
		return idLivro;
	}


	public void setIdLivro(int idLivro) {
		this.idLivro = idLivro;
	}


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


	public String getEditora() {
		return editora;
	}


	public void setEditora(String editora) {
		this.editora = editora;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getCapa() {
		return capa;
	}


	public void setCapa(String capa) {
		this.capa = capa;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}

}

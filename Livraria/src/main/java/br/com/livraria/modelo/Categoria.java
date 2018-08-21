//package br.com.livraria.modelo;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class Categoria {
//
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	private int idCategoria;
//	
//	@Column
//	private String nomeCategoria;
//	
//	
//	public Categoria() {
//		super();
//	}
//	public Categoria(int idCategoria, String nomeCategoria) {
//		super();
//		this.idCategoria = idCategoria;
//		this.nomeCategoria = nomeCategoria;
//	}
//	
//	
//	public int getIdCategoria() {
//		return idCategoria;
//	}
//	public void setIdCategoria(int idCategoria) {
//		this.idCategoria = idCategoria;
//	}
//	public String getNomeCategoria() {
//		return nomeCategoria;
//	}
//	public void setNomeCategoria(String nomeCategoria) {
//		this.nomeCategoria = nomeCategoria;
//	}
//	
//	
//}

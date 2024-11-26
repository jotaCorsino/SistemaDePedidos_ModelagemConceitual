package com.cursomc.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Id;
	private String Nome;
	private Double Preco;
	
	@ManyToMany
	@JoinTable(name = "Produto_Categoria",
				joinColumns = @JoinColumn(name = "Produto_Id"),
				inverseJoinColumns = @JoinColumn(name = "Categoria_Id"))
	
	private List<Categoria> Categorias = new ArrayList<>();
	
	public Produto() {
		
	}

	public Produto(Integer id, String nome, Double preco) {
		super();
		Id = id;
		Nome = nome;
		Preco = preco;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Double getPreco() {
		return Preco;
	}

	public void setPreco(Double preco) {
		Preco = preco;
	}

	public List<Categoria> getCategorias() {
		return Categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		Categorias = categorias;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(Id, other.Id);
	}
	
	
	
}

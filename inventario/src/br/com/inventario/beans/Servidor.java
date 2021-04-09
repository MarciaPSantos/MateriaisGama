package br.com.inventario.beans;

import java.util.List;

public class Servidor {
	
	private String nome;
	private String descricao;
	private List<Software> softwares;
	
	
	public Servidor(String nome, String descricao, List<Software> softwares) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.softwares = softwares;
	}


	public Servidor() {
		super();
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public List<Software> getSoftwares() {
		return softwares;
	}


	public void setSoftwares(List<Software> softwares) {
		this.softwares = softwares;
	}


	@Override
	public String toString() {
		return "Servidor [nome=" + nome + ", descricao=" + descricao + ", softwares=" + softwares + "]";
	}

	
	
}

package br.com.colecoes.beans;

public class CargoReduzido {
	
	private String nome;
	private String nivel;
	public CargoReduzido(String nome, String nivel) {
		super();
		this.nome = nome;
		this.nivel = nivel;
	}
	public CargoReduzido() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	@Override
	public String toString() {
		return "CargoReduzido [nome=" + nome + ", nivel=" + nivel + "]";
	}
	
	
	
}

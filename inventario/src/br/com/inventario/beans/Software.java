package br.com.inventario.beans;

public class Software {

	private String nome;
	private String funcao;
	private float valor;
	private byte licencas;
	
	public Software(String nome, String funcao, float valor, byte licencas) {
		super();
		this.nome = nome;
		this.funcao = funcao;
		this.valor = valor;
		this.licencas = licencas;
	}

	public Software() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public byte getLicencas() {
		return licencas;
	}

	public void setLicencas(byte licencas) {
		this.licencas = licencas;
	}

	@Override
	public String toString() {
		return "Software [nome=" + nome + ", funcao=" + funcao + ", valor=" + valor + ", licencas=" + licencas + "]";
	}
	
	
	
	
}

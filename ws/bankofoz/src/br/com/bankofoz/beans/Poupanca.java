package br.com.bankofoz.beans;

public class Poupanca extends Conta {

	private float rendimento;

	public Poupanca(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		super(numero, digito, agencia, saldo, cliente);
		this.rendimento = rendimento;
	}

	public Poupanca() {
		super();
	}

	public float getRendimento() {
		return rendimento;
	}

	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}

	@Override
	public String toString() {
		return "Poupanca [rendimento=" + rendimento + "," + super.toString() + "]";
	}
	
	//o saldo está na classe pai = set+get -> colocar a conta e o get dentro do set
	public void creditarRendimento() {
		setSaldo(getSaldo() + getSaldo()* (rendimento/100));
	}
		
}

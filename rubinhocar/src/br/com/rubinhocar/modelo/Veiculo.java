package br.com.rubinhocar.modelo;

public class Veiculo {

	/* o sinal de "-" na frente do atributo no Astah, signifca que ele é privado de determinada classe,
	 * fora da classe ninguém deve ter acesso.
	 */
	
	private String montadora;
	private	float valor;
	private short velocidadeAtual;
	private boolean status;
	private short velocidadeMaxima;
	private String modelo;
	
	
	// sintaxe dos métodos: 
	// <modificador> <tipo de retorno> <nome do metodo>(<tipo param> <nome param>
	
	public void preencherMontadora(String param) {
		montadora = param.toUpperCase();
	}	
	public String retornarMontadora() {
		return montadora;
	}
	
	
	public void preencherModelo(String param) {
		modelo = param.toUpperCase();
	}
		public String retornarModelo() {
		return modelo;
	}
	
		
	public void preencherValor(float param) {
		if (param>0) {
			valor = param;	
		}
	}	
	public float retornarValor() {
		return valor;
	}
	
	
	public void preencherBasico (boolean pSatus, short pVelocidadeMaxima) {
		status = pSatus;
		velocidadeMaxima = pVelocidadeMaxima;		
	}
	
	public String retornarTudo() {
		return 
				"Montadora........: " + montadora + "\n" +
				"Valor............: " + valor + "\n" +
				"Valocidade atual.: " + velocidadeAtual + "\n" +
				"Status...........: " + status + "\n" +
				"Valocidade máxima: " + velocidadeMaxima + "\n" +
				"Modelo...........: " + modelo;
	}
	
	public float retornarDesconto() {
		return valor * (float) 0.9;     //tem que colocar float aqui senão assume double
				
	}
	
	public String ligar() {
		status=true;
		return "Ligado";
	}
	
	
	public String desligar() {
		status=false;
		velocidadeAtual=0;
		return "Desligado";
	}
	
	public void acelerar(short velocidade) {
		if (status==true && (velocidadeAtual+velocidade)<=velocidadeMaxima) {
			velocidadeAtual+=velocidade;	
		}
	}	
	
	public void desacelerar (short velocidade) {
		if (status==true && (velocidadeAtual-velocidade)>=0) {
			velocidadeAtual-=velocidade;
		}	
	}
	

}	


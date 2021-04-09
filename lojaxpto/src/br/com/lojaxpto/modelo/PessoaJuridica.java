package br.com.lojaxpto.modelo;

// extends = pai da classe
public class PessoaJuridica extends Cliente {
	
		private String cnpj;
		private String contato;
		private String ie;
		
		@Override
		public String toString() { // super.toString = classe pai. Protected: qualquer classe filha pode acessar o produto
			return "PessoaJuridica [cnpj=" + cnpj + ", contato=" + contato + ", ie=" + ie + "," + super.toString() + "]";
		}

	//construtor cheio
		public PessoaJuridica(String nome, String email, String cnpj, String contato, String ie) {
			super(nome, email);
			this.cnpj = cnpj;
			this.contato = contato;
			this.ie = ie;
		}

	//construtor vazio
		public PessoaJuridica() {
			super();
		}

		public String getCnpj() {
			return cnpj;
		}

		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}

		public String getContato() {
			return contato;
		}

		public void setContato(String contato) {
			this.contato = contato;
		}

		public String getIe() {
			return ie;
		}

		public void setIe(String ie) {
			this.ie = ie;
		}

	
	
}

package br.com.gama.modelo;


/* Design Pattern: conjunto com as melhores pr?ticas para POO.
 * 	-DTO (Data Transfer Object): ? um pattern, que descreve as melhores pr?ticas para representar uma classe de um diagrama
 * em uma programa??o
 * Regras:
 * 	1. TODOS os atributos devem ser privados
 * 	2. CADA atributo, deve possuir INDIVIDUALMENTE um m?todo de input (SET) e outro para output (GET)
 *  (Para criar um m?todo de entrada e um de sa?da para cada atributo: deixa o cursor embaixo do ultimo atributo -> source -> generate getters and setters)
 *  3. TODA classe modelo deve possuir no MINIMO 2 Construtores (CONSTRUTOR sempre tem o nome da classe)
 *  	- um vazio (n?o faz absolutamente nada)
 *  	- um cheio (preenche todos os atributos)
 *   
 * modelo= model = beans = javabeans = to = dto (pacotes com classes originadas do diagrama)
 * teste = principal = implementacao (pacotes com as classes que contenham o main)
 */  


public class Aluno {

	private String nome;
	private int matricula;
	private String email;
	private String fone;
	private Endereco endereco; //primeiro a classe, depois o atributo
	
		
	// cia??o de construtor cheio - source + generate constructor using fields -> select all
	public Aluno(String nome, int matricula, String email, String fone, Endereco endereco) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
		this.fone = fone;
		this.endereco = endereco;
	}
	
	
	// cia??o de construtor vazio - source + generate constructor using fields -> deselect all
	public Aluno() {
		super();
	}


	//m?todo a mais para setar tudo de uma vez
	public void setAll(Endereco endereco, String nome, int matricula, String email, String fone) {
		this.endereco = endereco;
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
		this.fone = fone;
	}
		
		
	public String getNome() {
		return nome;
	}
		
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getFone() {
		return fone;
	}
	
	public void setFone(String fone) {
		this.fone = fone;
	}


	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", email=" + email + ", fone=" + fone
				+ ", endereco=" + endereco + "]";
	}
	
	//getUsuario(): deve retornar o usuario do e-mail (contendo antes do arroba)
	public  String getUsuario() {
		if (email.contains("@")==true) {
			return email.substring(0,email.indexOf("@"));
		}else {
			return "E-mail n?o ? valido";
		}
	}
	
	
			
	
}

package br.com.gama.implementacao;

import javax.swing.JOptionPane;

import br.com.gama.modelo.Aluno;
import br.com.gama.modelo.Endereco;

public class TesteAluno {

	public static void main(String[] args) {
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro("AVENIDA ITAQUERA");
		endereco.setNumero("358A-FUNDOS");
		endereco.setComplemento("Viela 321");
		endereco.setBairro("ITAQUERA");
		endereco.setCidade("SÃO PAULO");
		endereco.setUf("SP");
		endereco.setCep("12345-123");
		
		
        //aluno = nome diagrama (nome da classe)
		Aluno aluno = new Aluno();
		aluno.setEndereco(endereco); //atributo que faz referencia à uma classe
		aluno.setEmail(JOptionPane.showInputDialog("Email: ").toLowerCase());
		aluno.setFone(JOptionPane.showInputDialog("Fone: "));
		aluno.setNome(JOptionPane.showInputDialog("Nome: "));
		aluno.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Matricula :")));
		
		System.out.println("Email: " + aluno.getNome());
		System.out.println("Fone: " + aluno.getFone());
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Matricula: " + aluno.getMatricula());
		System.out.println("Endereco: " + aluno.getEndereco());
		
		
		//OU ================================================================		
		
		Aluno aluno2 = new Aluno();		
		aluno2.setAll(
				endereco, //chamada da nova classe 
				JOptionPane.showInputDialog("Nome2: ").toUpperCase(),
				Integer.parseInt(JOptionPane.showInputDialog("Matricula2: ")),
				JOptionPane.showInputDialog("EMail2: ").toLowerCase(),
				JOptionPane.showInputDialog("Telefone2 :")
				);
				
		System.out.println(aluno2.toString());

		//mostrar um atributo dentro do objeto Endereco
		System.out.println("Bairro: " + aluno.getEndereco().getBairro());
		System.out.println("Cidade: " + aluno.getEndereco().getBairro());
		
		
					
	}
	
}
